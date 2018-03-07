
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" errorPage="" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=Edge"/>
<title>中信证券收益互换交易平台</title>
<link rel="stylesheet" href="${contextPath}/js/common/plugins/jquery-ui/jquery-ui.css" type="text/css"/>
<link rel="stylesheet" href="${contextPath}/js/zTree/zTreeStyle.css" type="text/css"/>
<link href="${contextPath}/js/common/plugins/wdatepicker/skin/WdatePicker.css" rel="stylesheet" type="text/css"/>
<link href="${contextPath}/css/style.css" rel="stylesheet" type="text/css" />
<link href="${contextPath}/css/jquery.alert.css" rel="stylesheet" type="text/css" />
<link href="${contextPath}/css/report.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="${contextPath}/js/common/jquery/jquery.min.js"></script>

<script language="javascript">
	var contextPath = "${contextPath}";
</script>
</head>

<body>
	<div class="top" id="fixedtop">
		<div class="logo"></div>
		<div class="top_r">
			
			<div class="top_user"><img src="${contextPath}/images/user.png" >你好！<span id="showUserName">xxxxx</span><a href="javascript:void(0)" onclick="logout();">退出</a></div>
			<div class="top_sel">
				<div id="agreementContent" class="aaselect selectable">
				</div>
			</div>
		</div>
		<div id="topmenu" style="float:left;">
		<div class="menu">
			<div id="main_nav">
				
				<div id="previousMenu" class="arrow"><a href="#"><img src="${contextPath}/images/menu_arrow1.png" ></a></div>
				<div class="menuContent">
					<ul>
					
					</ul>
				</div>
				
				<div id="nextMenu" class="arrow"><a href="#"><img src="${contextPath}/images/menu_arrow2.png" ></a></div>
			</div>
		</div>
		</div>
	</div>
	<div class="main">
    <div class="leftdiv">
    <div class="dragHandle" style="width: 100%;height: 8px;"></div>
      <div class="left_search dragHandle">
        <div class="fl"><input id="productTreeSearch" autocomplete="off" name="treeSearchText" type="text" class="searchtxt" placeholder="代码/名称/拼音"></div>
        <div class="fl" style="padding-top:3px;"><a href="#"><img src="${contextPath}/images/search.png" ></a></div> 
	  </div>
	  <div id="lefttab" class="lefttab">
      </div>
      <div id="left_tree">
       <div id="searchTreeContainer">
       	   <span>搜索结果：</span>
       </div>
      </div>
    </div>
    <div class="rightdiv">
      <div class="rightdiv_t">
        <div class="lf">
          <div class="quotationRefresh"><img id="quotationRefresh" src="${contextPath}/images/refresh.png" ></div>
          <div class="t_title dragHandle">
            <ul>
              <li class="tabon"><img src="${contextPath}/images/r_icon.png" >&nbsp;&nbsp;<span id="quoteName" ></span></li>
            </ul>
          </div>
          <div style="position: relative;" class="data_background" id="quoteDiv">
	          <div id="quoteLoading" class="loading" align="center" style="position: absolute;top:190px;left:390px;"><img src="${contextPath}/images/loading.gif"></div>
	          <div id="noQuoteDataPrompt"  align="center" style="position: absolute;top:190px;left:390px;display:none;"></div>
	          <div id="quote_scroll" class="scrollContainer" style="height: 396px;position: relative;overflow: hidden;">
		          <div class="scrollContent">
			          <table cellspacing="0" cellpadding="0" class="t_table" id="quote_table">
			          </table>
			      </div>
	          </div> 
          </div>
        </div>
        <div id="markQuote" class="rt">
          <div class="chart">
            <div name="sh000001" class="chart_title current"></div>
            <div class="chart_n">
             
            </div>
          </div>
          <div class="chart">
            <div name="sz399001" class="chart_title"></div>
            <div class="chart_n" style="display: none;">
              
            </div>
          </div>
          <div class="chart">
            <div name="sz399005" class="chart_title"></div>
            <div class="chart_n" style="display: none;">
               
            </div>
          </div>
          <div class="chart">
            <div name="sz399006" class="chart_title"></div>
            <div class="chart_n" style="display: none;">
               
            </div>
          </div>
          <div class="chart">
            <div name="sh000300" class="chart_title"></div>
            <div class="chart_n" style="display: none;">
              
            </div>
          </div>
          <div class="chart last">
            <div name="sh000016" class="chart_title"></div>
            <div class="chart_n" style="display: none;">
              
            </div>
          </div> 
        </div>
      </div>
      <div class="clear"></div>
    <div class="rightdiv_b mt8">
      <div class="positionRefresh"><img id="positionRefresh" src="${contextPath}/images/refresh.png" ></div>
      <div class="t_title dragHandle">
        <ul class="secPositions">
        </ul>
      </div>
      <div style="position: relative;" id="secuData" class="data_background">
        <div id="positionLoading" class="loading" align="center" style="position: absolute;top:50px;left:500px;"><img src="${contextPath}/images/loading.gif"></div>
        <div id="noPositionDataPrompt"  align="center" style="position: absolute;top:50px;left:500px;display:none;"><无数据显示></div>
        <div id="position_table_scroll" class="scrollContainer" style="height: 324px;position: relative;overflow: hidden;">  
        	<div class="scrollContent">
		        <table id="position_table" cellspacing="0" cellpadding="0" class="t_table reportTable">
		        </table>
	        </div>
          </div> 
      </div>
   </div>
  </div>
</div>
  <div id="alert"> 
		 <p><span id="infoMsg">交易界面已锁定，请输入密码解锁</span></p><br>
		 <input type="hidden" id="com_cilentId" value=""/>
		 <p>
			 <label>客户号:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			 <span></span>
		 </p> 
		 <p>
			 <label>密 &nbsp;&nbsp;码: </label>
			 <input id="com_password" type="password" class="cilentClass"/>
		 </p> 
		 <p>
			 <div>
			 	<input type="submit" value="登录" class="sub" />
			 	<input type="button" value="退出" class="sub2"/>
			 </div>
		 </p>
		 <h4><span id="errorMsg"></span></h4> 
	</div>
  <div id="popDiv"></div>
</body>

</html>