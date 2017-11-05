package org.tmea.unido.ipmis;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.tmea.unido.ipmis.ws.Medicine;
import org.tmea.unido.ipmis.ws.MedicineWs;
import org.tmea.unido.ipmis.ws.MedicineWsService;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

public class actionSearchMethod extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// System.out.println("*****Inside doView******");
		String fromString = (String) renderRequest.getAttribute("fromAction");
		if (fromString != null && fromString.equals("true")) {
			getPortletContext().getRequestDispatcher("/html/searchmedicine/success.jsp").include(renderRequest,
					renderResponse);
			return;
		}
		super.doView(renderRequest, renderResponse);
	}

	public void actionSearchMethod(ActionRequest actionRequest, ActionResponse actionResponse)
			throws PortletException, IOException {

		String medicineSearchString = ParamUtil.getString(actionRequest, "medicine_search_string", "no search string");

		MedicineWs webservice = new MedicineWsService().getMedicineWsPort();
		List<Medicine> medicine = webservice.getSearchResult(medicineSearchString);

		// for(Medicine m2 : medicine){
		actionRequest.setAttribute("actionSearchMethodList", medicine);

		// }
		System.out.println(">>>>>>>>>" + medicineSearchString);

		actionRequest.setAttribute("fromAction", "true");
	}

}
