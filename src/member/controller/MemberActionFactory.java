package member.controller;

import member.service.MemberEmailCheakAction;
import member.service.MemberIdCheckAction;
import member.service.MemberLoginAction;
import member.service.MemberLoginProAction;
import member.service.MemberMainAction;
import member.service.MemberWriteAction;
import member.service.MemberWriteProAction;
import service.Action;


public class MemberActionFactory {
private static MemberActionFactory instance=new MemberActionFactory();
	
	private MemberActionFactory() {
		super();
	}
	public static MemberActionFactory getInstance() {
		return instance;
	}
	public Action getAction(String command) {
		Action action=null;
		if(command.contentEquals("member_main")) {
			action=new MemberMainAction();
		}else  if(command.contentEquals("member_write")) {
			action=new MemberWriteAction();
		}else if(command.contentEquals("member_write_pro")) {
			action=new MemberWriteProAction();
			
		}else if(command.contentEquals("member_email")) {
			action=new MemberEmailCheakAction();
		}else if(command.contentEquals("member_idCheck")) {
			action=new MemberIdCheckAction();
		}else if(command.contentEquals("member_login")) {
			action=new MemberLoginAction();
		}else if(command.contentEquals("member_login_pro")) {
			action=new MemberLoginProAction();
		}
		/*if(command.equals("member_list")) {
			action=new memberListAction();	
		}else if(command.equals("member_insert")){
			action=new memberWriteAction();
		}else if(command.equals("member_insert_pro")){
			action=new memberWriteProAction();
		}else if(command.equals("member_id_check")){
			action=new memberIdCheckAction();	
		}else if(command.equals("member_email_check")){
			action=new memberEmailCheakAction();
		}else if(command.equals("member_login")){
			action=new memberLoginAction();	
		}else if(command.equals("member_view")){
			action=new memberViewAction();
		}else if(command.equals("member_modify")){
			action=new memberModifyAction();
		}else if(command.equals("member_modify_pro")){
			action=new memberModifyProAction();
		}else if(command.equals("member_delete")){
			action=new memberDeleteAction();
		}else if(command.equals("member_delete_pro")){
			action=new memberDeleteProAction();
			}*/
		return action;
	}
	
}
