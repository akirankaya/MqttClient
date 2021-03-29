// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mqttclient.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

import mqttclient.impl.MqttConnector;

public class MqttUnsubscribe extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String BrokerHost;
	private java.lang.Long BrokerPort;
	private java.lang.String TopicName;

	public MqttUnsubscribe(IContext context, java.lang.String BrokerHost, java.lang.Long BrokerPort, java.lang.String TopicName)
	{
		super(context);
		this.BrokerHost = BrokerHost;
		this.BrokerPort = BrokerPort;
		this.TopicName = TopicName;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		try {
			MqttConnector.unsubscribe(this.BrokerHost, this.BrokerPort, this.TopicName);
			return true;
		} catch (Exception e) {
			return false;
		}
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "MqttUnsubscribe";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
