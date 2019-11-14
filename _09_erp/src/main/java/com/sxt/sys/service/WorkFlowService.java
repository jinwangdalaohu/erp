package com.sxt.sys.service;

import com.sxt.sys.domain.LeaveBill;
import com.sxt.sys.utils.DataGridView;
import com.sxt.sys.vo.WorkFlowVo;
import org.activiti.engine.repository.ProcessDefinition;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public interface WorkFlowService {
	//查询流程部署信息
	public DataGridView queryProcessDeploy(WorkFlowVo workFlowVo);
	//查询所有的流程定义
	public DataGridView queryAllProcessDefinition(WorkFlowVo workFlowVo);
	//添加流程部署
    void addWorkFlow(InputStream inputStream, String deploymentName);
    //根据流程部署ID删除流程部署信息
	void deleteWorkFlow(String deploymentId);
	//根据流程部署ID查询流程图
	InputStream queryProcessDeploymentImage(String deploymentId);
	//启动流程图
	void startProcess(Integer leaveBillId);
	//查询当前登录用户的代办任务
	DataGridView queryCurrentUserTask(WorkFlowVo workFlowVo);
	//根据任务ID查询请假单信息
	LeaveBill queryLeaveBillByTaskId(String taskId);
	//根据任务ID查询连线信息
	List<String> queryOutComeByTaskId(String taskId);
	//根据任务ID查询批准信息
	DataGridView queryCommentByTaskId(String taskId);
	//完成任务
	void completeTask(WorkFlowVo workFlowVo);
	//根据任务ID查询流程定义对象
	ProcessDefinition queryProcessDefinitionByTaskId(String taskId);
	//根据任务ID查询节点坐标
	Map<String, Object> queryTaskCoordinateByTaskId(String taskId);
	//根据请假当的ID查询批注信息
	DataGridView querydCommentByLeaveBillId(Integer id);
}
