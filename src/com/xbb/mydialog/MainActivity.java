package com.xbb.mydialog;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * @todo: TODO
 * @author: xiaobao
 * @time: 2015-6-22下午4:29:45
 */
public class MainActivity extends Activity {

	private final String title ="提示信息";
//	private final String message = "1.服务器繁忙";
//	private final String message = "1.服务器繁忙,稍后重试, 网站正在维护 没有权限访问\n\n2.服务器繁忙,稍后重试\n\n3.网络不稳定,国外网站会慢";
	private final String message = "1.服务器繁忙,稍后重试, 网站正在维护 没有权限访问\n\n2.服务器繁忙,稍后重试\n\n3.网络不稳定,国外网站会慢\n\n1.服务器繁忙,稍后重试, 网站正在维护 没有权限访问\n\n2.服务器繁忙,稍后重试\n\n3.网络不稳定,国外网站会慢1.服务器繁忙,稍后重试, 网站正在维护 没有权限访问\n\n2.服务器繁忙,稍后重试\n\n3.网络不稳定,国外网站会慢1.服务器繁忙,稍后重试, 网站正在维护 没有权限访问\n\n2.服务器繁忙,稍后重试\n\n3.网络不稳定,国外网站会慢1.服务器繁忙,稍后重试, 网站正在维护 没有权限访问\n\n2.服务器繁忙,稍后重试\n\n3.网络不稳定,国外网站会慢";
    
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    
     /**
      * 显示系统的样式
      * @param v
      */
    public void  showAlertDialogBtn(View v){
    	AlertDialog.Builder builder = new AlertDialog.Builder(this);
    	builder
	    	.setTitle(title)
	    	.setMessage(message)
	    	.setPositiveButton("确定", new OnClickListener() {
				@Override
				public void onClick(DialogInterface dialogInterface, int i) {
					Toast.makeText(MainActivity.this, "确定", Toast.LENGTH_SHORT).show();
				}
			 })
			.setNegativeButton("取消", new OnClickListener() {
				@Override
				public void onClick(DialogInterface arg0, int arg1) {
					Toast.makeText(MainActivity.this, "取消", Toast.LENGTH_SHORT).show();
				}
			})
			.show();
    }
    
    /**
     * 显示自定义样式
     * @param v
     */
    public void  showMyAlertDialogBtn1(View v){
    	View titleView = LayoutInflater.from(this).inflate(R.layout.dialog_title_lay, null);
    	TextView titleTv = (TextView) titleView.findViewById(R.id.tv_dialog_title);
    	View contentView = LayoutInflater.from(this).inflate(R.layout.dialog_msg_lay, null);
    	TextView messageTv = (TextView) contentView.findViewById(R.id.tv_dialog_message);
    	titleTv.setText(title);
    	messageTv.setText(message);
    	
    	AlertDialog.Builder builder = new AlertDialog.Builder(this);
    	AlertDialog dialog = builder
	    	 .setCustomTitle(titleView)
	    	 .setView(contentView)
	    	 .setPositiveButton("确定", new OnClickListener() {
					@Override
					public void onClick(DialogInterface dialogInterface, int i) {
						Toast.makeText(MainActivity.this, "确定", Toast.LENGTH_SHORT).show();
					}
				 })
			  .setNegativeButton("取消", new OnClickListener() {
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						Toast.makeText(MainActivity.this, "取消", Toast.LENGTH_SHORT).show();
					}
				})
			.show();
    	
//    	  final int titleId = this.getResources().getIdentifier("alertTitle","id","android");
//        TextView titleTxt = (TextView) dialog.findViewById(titleId);
//        titleTxt.setText("标题");
//        titleTxt.setTextColor(getResources().getColorStateList(R.color.YELLOW_BG));
//        titleTxt.setBackgroundColor(getResources().getColor(R.color.top_bg));
//        titleTxt.setGravity(Gravity.CENTER);
        
    	final int titleDivider = this.getResources().getIdentifier("titleDivider","id","android");
        View titleDividerImg =  dialog.findViewById(titleDivider);
        titleDividerImg.setBackgroundResource(R.color.white);
    	Button button = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
    	button.setTextColor(getResources().getColorStateList(R.color.green));
    	button.setBackgroundResource(R.drawable.selector_dialog_btn);
    	Button button2 = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
    	button2.setTextColor(getResources().getColorStateList(R.color.green));
    	button2.setBackgroundResource(R.drawable.selector_dialog_btn);
    }
    
}
