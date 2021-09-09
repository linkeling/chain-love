package com.match.making.utils;

import com.alibaba.fastjson.JSONException;
import com.match.making.param.output.SysUserDTO;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liucheng
 * @since 2020/01/15
 * JwtHelper
 */
@Component
public class JwtHelper {

    private static final String SECRET="A0B1C2D3E4F5G6H7I8J9KALBMCNDOEPFQ0R1S2T3U4V5W6X7Y8Z9";

    private static final Long EXPIRATION_TIME=12L;

    private static final String TOKEN_PREFIX = "bearer";

    public static JwtTokenResult generateToken(SysUserDTO customClaims) throws JSONException {
        Map<String, Object> claims = new HashMap<String, Object>();
        claims.put("userName", customClaims.getUserName());
        claims.put("userId", customClaims.getId());
        claims.put("roleId", customClaims.getRoleId());
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.HOUR, EXPIRATION_TIME.intValue());
        Date d = c.getTime();
        String jwt = Jwts.builder()
                .setClaims(claims)
                .setExpiration(d)
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();
        JwtTokenResult json = new JwtTokenResult();
        json.setAccess_token(jwt);
        json.setExpire_time(new SimpleDateFormat("yyyy-MM-dd HH:ss:mm").format(d));
        json.setToken_type(TOKEN_PREFIX);
        json.setSysUserInfoDTO(customClaims);
        return json;
    }

    //验证token
    public static Boolean validateTokenAndGetClaims(String token) {
        try {
            if (StringUtils.isEmpty(token)) {
                return false;
            }
            Map<String, Object> body = Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
                    .getBody();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 根据token获取用户信息
     * @param token
     * @return
     */
    public static SysUserDTO getJwtTokenResult(String token) {
        try {
            if (StringUtils.isEmpty(token)) {
                return null;
            }
            Map<String, Object> body = Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
                    .getBody();
            SysUserDTO currentUser=new SysUserDTO();
            currentUser.setId(Long.valueOf(body.get("userId").toString()));
            currentUser.setUserName(body.get("userName").toString());
            currentUser.setRoleId(Long.valueOf(body.get("roleId").toString()));
            return currentUser;
        } catch (Exception e) {
            return null;
        }
    }
}
