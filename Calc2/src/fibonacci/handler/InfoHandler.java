package fibonacci.handler;

import java.util.Vector;
import java.security.Principal;

import javax.xml.namespace.QName;
import javax.xml.rpc.handler.GenericHandler;
import javax.xml.rpc.handler.HandlerInfo;
//import javax.xml.rpc.handler.MessageContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.axis.Message;
//import org.apache.axis.MessageContext;
import org.apache.ws.security.*;
import org.apache.ws.security.handler.*;

public class InfoHandler extends GenericHandler {

	protected static Log log = LogFactory.getLog(InfoHandler.class);

	protected HandlerInfo info = null;

	public boolean handleRequest (javax.xml.rpc.handler.MessageContext context) {
		try {
			org.apache.axis.MessageContext axisContext = org.apache.axis.MessageContext.getCurrentContext(); 

			// get information about the service and the opration invoked
			log.info("target service: "+axisContext.getTargetService());
			log.info("operation: "+axisContext.getOperation().getName());

			Vector results = null;
			// get the result Vector from the property
			if ((results =
				(Vector) context.getProperty(WSHandlerConstants.RECV_RESULTS))
				 == null) {
				log.info("No security results!!");
				return true;
			}
			log.info("Number of results: " + results.size());
			for (int i = 0; i < results.size(); i++) {
				WSHandlerResult hResult = (WSHandlerResult) results.get(i);
				String actor = hResult.getActor();
				Vector hResults = hResult.getResults();
				for (int j = 0; j < hResults.size(); j++) {
					WSSecurityEngineResult eResult = (WSSecurityEngineResult) hResults.get(j);
					int action = eResult.getAction();
					log.info("action="+action);

					if (action == WSConstants.UT) {
						// UsernameToken action returns a principal
						Principal p = eResult.getPrincipal();
						log.info(p.getName());
					} else if (action == WSConstants.SIGN) {
						// Signature action returns a principal and a certificate,
						// which contains the principals of both issuer and subject
						Principal p = eResult.getPrincipal();
						log.info(p.getName());
						java.security.cert.X509Certificate cert = eResult.getCertificate();
						Principal subjectPrincipal = cert.getSubjectDN();
						log.info(subjectPrincipal.getName());
						Principal issuerPrincipal = cert.getIssuerDN();
						log.info(issuerPrincipal.getName());
					} else if (action == WSConstants.ENCR) {
						// Encryption action returns what ?
					} else if (action == WSConstants.TS) {
						// Timestamp action returns a Timestamp
						log.info("timestamp created: "+eResult.getTimestamp().getCreated());
						log.info("timestamp expires: "+eResult.getTimestamp().getExpires());
					}
				}
			}
		} catch (Exception x) {
			// insert error handling here
			x.printStackTrace();
		}
		return true;
	}

	public void init (HandlerInfo arg) {
		info = arg;
	}

	/* (non-Javadoc)
	 * @see javax.xml.rpc.handler.Handler#getHeaders()
	 */
	public QName[] getHeaders() {
		return info.getHeaders();
	}
/*
	public void destroy() {
	}
*/
}

