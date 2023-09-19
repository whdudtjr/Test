package com.ja.stm.handler.container;

import com.ja.stm.component.DataModel;
import com.ja.stm.handler.AddStudentHandler;
import com.ja.stm.handler.AnotherHandler;
import com.ja.stm.handler.CommandHandler;
import com.ja.stm.handler.DeleteStudentHandler;
import com.ja.stm.handler.SearchStudentHandler;
import com.ja.stm.handler.StatisticsHandler;
import com.ja.stm.handler.StudentListHandler;
import com.ja.stm.handler.TestHandler;

public class CommandHandlerContainer {
	private DataModel dataModel = new DataModel();
	
	
	public CommandHandler get(String command) {
		switch(command) {
		case "1" : return new AddStudentHandler(dataModel);
		case "2" : return new StudentListHandler(dataModel);
		case "3" : return new SearchStudentHandler(dataModel);
		case "4" : return new DeleteStudentHandler(dataModel);
		case "5" : return new StatisticsHandler(dataModel);
		case "6" : return new TestHandler();
		default : return new AnotherHandler();
		}
	}
}
