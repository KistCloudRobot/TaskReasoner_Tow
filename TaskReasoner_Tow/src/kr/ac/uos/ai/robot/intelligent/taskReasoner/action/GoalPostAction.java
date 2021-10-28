package kr.ac.uos.ai.robot.intelligent.taskReasoner.action;

import kr.ac.uos.ai.arbi.agent.logger.ActionBody;
import kr.ac.uos.ai.robot.intelligent.taskReasoner.TaskReasoner_Tow;
import kr.ac.uos.ai.robot.intelligent.taskReasoner.action.argument.GoalPostArgument;
import kr.ac.uos.ai.robot.intelligent.taskReasoner.message.GLMessageManager;

public class GoalPostAction implements ActionBody {

	private TaskReasoner_Tow reasoner;
	
	public GoalPostAction(TaskReasoner_Tow	reasoner) {
		this.reasoner = reasoner;
	}
	
	@Override
	public Object execute(Object o) {
		GoalPostArgument argument = (GoalPostArgument)o;
		//reasoner.sendToTM("postGoal", argument.getGoalName(), argument.getArguments());
		
		// TODO Auto-generated method stub
		return null;
	}
}
