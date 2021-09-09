package com.match.making.utils;

import com.google.gson.Gson;
import com.match.making.param.output.PicturesInfoDTO;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

import java.io.UnsupportedEncodingException;

public class FileUploadUtil {

    //构造一个带指定 Region 对象的配置类
    Configuration cfg = new Configuration(Region.region0());
    //...其他参数参考类注释
    UploadManager uploadManager = new UploadManager(cfg);

    @Value("${ybs.fileupload.bucket-name}")
    private String bucketName;

    @Value("${ybs.fileupload.access-key}")
    private String accessKey;

    @Value("${ybs.fileupload.secret-key}")
    private String secretKey;

    //默认不指定key的情况下，以文件内容的hash值作为文件名
    String key = null;


    /**
     * 上传文件（图片）
     *
     * @param multipartFile
     * @return
     */
    public  PicturesInfoDTO uploadImage(MultipartFile multipartFile) {
        try {
            byte[] uploadBytes = "hello qiniu cloud".getBytes("utf-8");
            Auth auth = Auth.create(accessKey, secretKey);
            String upToken = auth.uploadToken(bucketName);
            try {
                Response response = uploadManager.put(uploadBytes, key, upToken);
                //解析上传成功的结果
                DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
                System.out.println(putRet.key);
                System.out.println(putRet.hash);
            } catch (QiniuException ex) {
                Response r = ex.response;
                System.err.println(r.toString());
                try {
                    System.err.println(r.bodyString());
                } catch (QiniuException ex2) {
                    //ignore
                }
            }
        } catch (UnsupportedEncodingException ex) {
            //ignore
        }
        return null;
    }
}
