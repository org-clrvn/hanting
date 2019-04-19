package com.sy.hting.util;//package com.sy.hting.util;
//import java.io.IOException;
//import java.io.UnsupportedEncodingException;
//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.TreeMap;
//import java.util.UUID;
//
//import com.alibaba.fastjson.JSONObject;
//import org.apache.http.HttpResponse;
//import org.apache.http.NameValuePair;
//import org.apache.http.client.entity.UrlEncodedFormEntity;
//import org.apache.http.client.methods.HttpPost;
//
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClientBuilder;
//import org.apache.http.message.BasicNameValuePair;
//import org.apache.http.util.EntityUtils;
//
//
//public class PayUtil {
//
//
//	public static String API_USER = "f48f9d22";
//
//	public static String API_KEY = "0b09eb27-e199-4821-bf34-3298a75f7428";
//
//
//	public static JSONObject post(String url, Map<String, String> paramMap) {
//		JSONObject result = null;
//		CloseableHttpClient httpclient = null;
//		List<NameValuePair> params = new ArrayList<NameValuePair>();
//		for (String key : paramMap.keySet()) {
//			params.add(new BasicNameValuePair(key, paramMap.get(key)));
//		}
//
//		try {
//			httpclient = HttpClientBuilder.create().build();
//			HttpPost httpPost = new HttpPost(url);
//			httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
//			HttpResponse response = httpclient.execute(httpPost);
//			result = JSONObject.parseObject(EntityUtils.toString(response.getEntity(), "UTF-8"));
//			httpPost.releaseConnection();
//			httpclient.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			if (httpclient != null) {
//				try {
//					httpclient.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//
//		}
//
//		return result;
//	}
//
//
//	/**
//	 * 获取签名
//	 * @param api_key
//	 * @param api_user
//	 * @param price
//	 * @param type
//	 * @param redirect
//	 * @param order_id
//	 * @param order_info
//	 * @return
//	 * @throws UnsupportedEncodingException
//	 */
//	public static String getSignature(String api_user,TreeMap<String, String> treeMap) throws UnsupportedEncodingException {
//        String signStr = API_KEY;
//        for (String value : treeMap.values()) {
//            signStr = signStr + value;
//        }
//        System.out.println(signStr);
//        return makeMd5Sum(signStr.getBytes("UTF-8"));
//	}
//
//
//
//    /**
//     * 生成md5校验码
//     *
//     * @param srcContent
//     * 需要加密的数据
//     * @return 加密后的md5校验码。出错则返回null。
//     */
//    public static String makeMd5Sum(byte[] srcContent) {
//        if (srcContent == null) {
//            return null;
//        }
//
//        String strDes = null;
//
//        try {
//            MessageDigest md5 = MessageDigest.getInstance("MD5");
//            md5.update(srcContent);
//            strDes = bytes2Hex(md5.digest()); // to HexString
//        } catch (NoSuchAlgorithmException e) {
//            return null;
//        }
//        return strDes;
//    }
//
//    /**
//     * 将byte转换为字符串
//     *
//     * @param byteArray
//     * @return
//     */
//    private static String bytes2Hex(byte[] byteArray) {
//        StringBuffer strBuf = new StringBuffer();
//        for (int i = 0; i < byteArray.length; i++) {
//            if (byteArray[i] >= 0 && byteArray[i] < 16) {
//                strBuf.append("0");
//            }
//            strBuf.append(Integer.toHexString(byteArray[i] & 0xFF));
//        }
//        return strBuf.toString();
//    }
//
//
//}
