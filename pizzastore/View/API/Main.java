package API;

import StartObject.Starting;
import StartSupport.Assembly;
import StartSupport.MemberDTO;

public class Main {

	public static void main(String[] args) {

		
		
		
		Assembly ass = new Assembly();
		MemberDTO dto = ass.tutorial();
		ass.Game(dto);
		
	}

}