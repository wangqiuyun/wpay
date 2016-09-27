package com.wqy.util;

public class PayConfigUtil {

	//以下相关参数需要根据自己实际情况进行配置
	public static String APP_ID = "wx8000000111144444";// appid

	public static String APP_SECRET = "0fb66116e9f46d2d71116b30f0addd85";// appsecret 
	public static String MCH_ID = "1311111100";// 你的商业号
	public static String API_KEY = "0f666116e944466661117777f0addddd";// API key 
	
	public static String CREATE_IP = "8.8.8.8";// key 
	public static String UFDODER_URL = "https://api.mch.weixin.qq.com/pay/unifiedorder";//统一下单接口 
	public static String NOTIFY_URL = "http://80.20.1.195:8080/wpay/Re_notify";//回调地址
}
