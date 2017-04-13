package fibonacci;

import java.util.Iterator;

import javax.xml.soap.*;

import org.w3c.dom.Node;

public class ClientSAAJ {

   public static void main (String args[]) {
		String n1 = args[0];

		int port = 8080;
		if (args.length > 1)
			port = Integer.parseInt(args[1]);

		try {
			// First create the connection
			SOAPConnectionFactory soapConnFactory = SOAPConnectionFactory.newInstance();
			SOAPConnection connection = soapConnFactory.createConnection();

			// Next, create the actual message
			MessageFactory messageFactory = MessageFactory.newInstance();
			SOAPMessage message = messageFactory.createMessage();

// start: setting HTTP headers
			String authorization = Base64Coder.encode("wsuser:wspwd");
			MimeHeaders hd = message.getMimeHeaders();
			hd.addHeader("Authorization", "Basic " + authorization);
// end: setting HTTP headers

			SOAPPart soapPart = message.getSOAPPart();
			SOAPEnvelope envelope = soapPart.getEnvelope();

// start: setting SOAP body
			// Create and populate the body
			SOAPBody body = envelope.getBody();

			// Create the main element and namespace
			SOAPElement bodyElement = body.addChildElement(
				envelope.createName("calculateFibonacci", "ns1", "urn:fibonacci"));
			// Add content
			bodyElement.addChildElement("in0").addTextNode(n1);

			// Save the message
			message.saveChanges();
// end: setting SOAP body

			// Set the destination
			String destination = "http://localhost:"+port+"/axis/services/fibonacci";
			// Send the message and get the reply
			SOAPMessage reply = connection.call(message, destination);

			// Retrieve the result
			soapPart = reply.getSOAPPart();
			envelope = soapPart.getEnvelope();
			body = envelope.getBody();

			Iterator iter = body.getChildElements();
			Node fibReturn = ((Node) iter.next()).getFirstChild();
			Node result = fibReturn.getFirstChild();

			System.out.println("Fibonacci("+n1+") = "+result.getNodeValue());

			// Close the connection   
			connection.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

