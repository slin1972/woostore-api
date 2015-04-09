package com.woo.server.error;

import com.woo.server.util.CommonResult;

public class ReturnCode {

	public final static CommonResult OK_0 = new CommonResult(true, 0, "OK");
	

	public final static CommonResult ERROR_100 = new CommonResult(false,100,"密文为空。");
	public final static CommonResult ERROR_101 = new CommonResult(false, 101,"密文中包含的参数有错误的KeyValue。");
	
	public final static CommonResult ERROR_200 = new CommonResult(false,200,"Server exception.");
	public final static CommonResult ERROR_300 = new CommonResult(false,300,"Access Error.");
	public final static CommonResult ERROR_301 = new CommonResult(false,301,"Token expire.");
	

	public final static CommonResult ERROR_302 = new CommonResult(false,302,"Params:av is empty.");
	public final static CommonResult ERROR_303 = new CommonResult(false,303,"Params:et is empty.");
	public final static CommonResult ERROR_304 = new CommonResult(false,304,"Params:os is empty.");
	public final static CommonResult ERROR_305 = new CommonResult(false,305,"Params:m is empty.");
	public final static CommonResult ERROR_306 = new CommonResult(false,306,"Params:dpi is empty.");
	public final static CommonResult ERROR_307 = new CommonResult(false,307,"Params:uid is empty.");
	public final static CommonResult ERROR_308 = new CommonResult(false,308,"Function already close or temporary close.");
	public final static CommonResult ERROR_309 = new CommonResult(false,309,"Account login in other address.");

	public final static CommonResult ERROR_102 = new CommonResult(false, 102,"wrong phone");
	public final static CommonResult ERROR_103 = new CommonResult(false, 103,"wrong password");

	public final static CommonResult ERROR_104 = new CommonResult(false,104,"This phone number has been registered.");
	public final static CommonResult ERROR_105 = new CommonResult(false,105,"Invalid code.");
	public final static CommonResult ERROR_106 = new CommonResult(false,106,"Register failed.");
	public final static CommonResult ERROR_107 = new CommonResult(false,107,"Not associated with the account.");

	public final static CommonResult ERROR_108 = new CommonResult(false,108,"Not found the user.");
	public final static CommonResult ERROR_109 = new CommonResult(false,109,"Device add failed.");
	public final static CommonResult ERROR_134 = new CommonResult(false,134,"Device list not found in unkownDevices.");
	public final static CommonResult ERROR_110 = new CommonResult(false,110,"BabyProfile save failed.");
	public final static CommonResult ERROR_111 = new CommonResult(false,111,"Query the user is not the baby relatives.");
	public final static CommonResult ERROR_139 = new CommonResult(false,139,"Query the user is not the baby administrator.");
	public final static CommonResult ERROR_135 = new CommonResult(false,135,"Device not exist.");
	public final static CommonResult ERROR_136 = new CommonResult(false,136,"You do not focus on this baby.");
	public final static CommonResult ERROR_112 = new CommonResult(false,112,"Device sn already exists in your device list.");
	public final static CommonResult ERROR_132 = new CommonResult(false,132,"Device sn already exists in other person device list.");
	public final static CommonResult ERROR_113 = new CommonResult(false,113,"Baby json format error.");
	public final static CommonResult ERROR_114 = new CommonResult(false,114,"Config json format error.");
	public final static CommonResult ERROR_115 = new CommonResult(false,115,"Device config save failed.");
	public final static CommonResult ERROR_116 = new CommonResult(false,116,"Page json format error.");
	public final static CommonResult ERROR_117 = new CommonResult(false,117,"Did contains babyid not equlas bid.");
	
	public final static CommonResult ERROR_118 = new CommonResult(false,118,"Invite add failed.");
	public final static CommonResult ERROR_119 = new CommonResult(false,119,"Invite already exists, and has been accepted.");
	public final static CommonResult ERROR_120 = new CommonResult(false,120,"Invite already exists, is waiting to accept.");
	
	public final static CommonResult ERROR_121 = new CommonResult(false,121,"Sar json format error.");
	public final static CommonResult ERROR_122 = new CommonResult(false,122,"Safe region add failed.");
	public final static CommonResult ERROR_129 = new CommonResult(false,129,"Safe region name repeat.");
	public final static CommonResult ERROR_130 = new CommonResult(false,130,"Safe region latlng repeat.");
	public final static CommonResult ERROR_131 = new CommonResult(false,131,"Safe region not exists.");
	
	public final static CommonResult ERROR_123 = new CommonResult(false,123,"Feedback json format error.");
	public final static CommonResult ERROR_124 = new CommonResult(false,124,"Feedback add failed.");
	public final static CommonResult ERROR_125 = new CommonResult(false,125,"Nick and relateName all null.");
	public final static CommonResult ERROR_126 = new CommonResult(false,126,"Set failed.");
	

	public final static CommonResult ERROR_127 = new CommonResult(false,127,"Device command busy.");
	public final static CommonResult ERROR_128 = new CommonResult(false,128,"Device command response timeout.");
	public final static CommonResult ERROR_133 = new CommonResult(false,133,"Device disconnect.");
	
	public final static CommonResult ERROR_137 = new CommonResult(false,137,"FlowerIndex !> FlowerCount.");
	public final static CommonResult ERROR_138 = new CommonResult(false,138,"Flower json format error.");
	public final static CommonResult ERROR_144 = new CommonResult(false,144,"Phone and email all is empty.");
	public final static CommonResult ERROR_145 = new CommonResult(false,145,"Area code is empty.");
}
	
	
