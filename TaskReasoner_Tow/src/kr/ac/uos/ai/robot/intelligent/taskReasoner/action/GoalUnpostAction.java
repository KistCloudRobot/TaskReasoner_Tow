package kr.ac.uos.ai.robot.intelligent.taskReasoner.action;

import kr.ac.uos.ai.arbi.agent.logger.ActionBody;
import kr.ac.uos.ai.robot.intelligent.taskReasoner.TaskReasoner_Tow2;
import kr.ac.uos.ai.robot.intelligent.taskReasoner.action.argument.GoalPostArgument;

public class GoalUnpostAction implements ActionBody{

	private TaskReasoner_Tow2 reasoner;
	
	public GoalUnpostAction(TaskReasoner_Tow2 resoner) {
		this.reasoner = resoner;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public Object execute(Object o) {
		GoalPostArgument argument = (GoalPostArgument) o;
		
		reasoner.sendToTM("unpostGoal", argument.getGoalName());
		// TODO Auto-generated method stub
		return null;
	}

}
