package edu.kit.ss17.chatsys.team1.server.StreamProcessor;

import edu.kit.ss17.chatsys.team1.shared.StreamProcessor.StreamProcessorInterface;
import edu.kit.ss17.chatsys.team1.shared.Util.DesignHelpers.Factory;

/**
 * Singleton. Creates StreamProcessorInterface objects.
 */
public final class ServerStreamProcessorFactory implements Factory<StreamProcessorInterface> {

	private static ServerStreamProcessorFactory instance;

	/**
	 * Private constructor because it is a singleton.
	 */
	private ServerStreamProcessorFactory() {
		ServerStreamProcessor.setUp(); // sets up the StreamProcessor class
	}

	/**
	 * @return this Singleton's instance.
	 */
	public static ServerStreamProcessorFactory getInstance() {
		return (instance != null) ? instance : (instance = new ServerStreamProcessorFactory());
	}

	/**
	 * @return a new StreamProcessor instance.
	 */
	public static StreamProcessorInterface make() {
		return getInstance().makeInstance();
	}

	@Override
	public StreamProcessorInterface makeInstance() {
		return new ServerStreamProcessor();
	}
}
