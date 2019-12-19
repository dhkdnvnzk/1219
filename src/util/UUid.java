package util;

import java.util.UUID;

public class UUid {
	public static void main(String[] args) {
		 for(int i=0;i<5;i++) {
			 String uuid=UUID.randomUUID().toString().substring(0,8);
			 System.out.println(uuid);
		 }
	}

}
