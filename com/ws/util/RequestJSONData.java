package com.ws.util;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

/**
 * 请求json解析
 */
public class RequestJSONData {


    public static String ReadAsChars(HttpServletRequest request) {

        BufferedReader br = null;
        StringBuilder sb = new StringBuilder("");
        try{
            br = request.getReader();
            String str;
            while ((str = br.readLine()) != null){
                sb.append(str);
            }
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (null != br){
                try {
                    br.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    public static String ReadAsChars2(HttpServletRequest request){
        InputStream is = null;
        StringBuilder sb = new StringBuilder();
        try {
            is = request.getInputStream();
            byte[] b = new byte[4096];
            for (int n; (n = is.read(b)) != -1;)
            {
                sb.append(new String(b, 0, n));
            }
        }catch (IOException e){
            e.printStackTrace();
        } finally{
            if (null != is){
                try{
                    is.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    // 二进制读取
    public static byte[] readAsBytes(HttpServletRequest request)
    {

        int len = request.getContentLength();
        byte[] buffer = new byte[len];
        ServletInputStream in = null;

        try{
            in = request.getInputStream();
            in.read(buffer, 0, len);
            in.close();
        } catch (IOException e){
            e.printStackTrace();
        }finally{
            if (null != in){
                try{
                    in.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        return buffer;
    }
}
