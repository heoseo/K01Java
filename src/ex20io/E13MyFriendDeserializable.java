package ex20io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class E13MyFriendDeserializable {

	public static void main(String[] args) {
		/*
		인스턴스의 복원(역직렬화)를 위한 스트릶을 생성하고 readObject()를 통해 복원한다.
		 */
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/ex20io/friend_list.obj"));
			
			while(true) {
				Friend friend = (Friend) in.readObject();
				if(friend == null)
					break;
				friend.showAllData();
			}
		}
		catch(Exception e) {
//			e.printStackTrace();
			System.out.println("복원시 예외발생");
		}
		
//		Friend[] outFriends = new Friend[numOfFriends];
//		
//		System.out.println("저장된 정보 출력]]]]]]]]]]]]]]]]]]");
//		for(int i=0 ; i<numOfFriends ; i++) {
//			outFriends[i] = (Friend)in.readObject();
//			outFriends[i].showAllData();
//			System.out.println(outFriends[i].name);
//		}
//		
//		in.close();

	}

}
