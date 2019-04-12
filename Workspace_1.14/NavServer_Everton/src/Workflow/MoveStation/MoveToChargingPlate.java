package Workflow.MoveStation;

import com.kuka.nav.task.NavTaskCategory;

import Workflow.KMR.MapConfiguration.PhotocatNodeIdFinePositioning;
import Workflow.KMR.Util.MOAGraphMotionTasks;
@NavTaskCategory
public class MoveToChargingPlate extends MOAGraphMotionTasks {
	@Override
	public void run() throws Exception {
		GoAndFinePosition(PhotocatNodeIdFinePositioning.ChargingStation);
	}
}
