package com.taobao.api.internal.toplink.logging;

import org.apache.log4j.Level;

import com.taobao.api.internal.toplink.Logger;

public class Log4jLogger implements Logger {
	
	private org.apache.log4j.Logger logger;
	
	public Log4jLogger(org.apache.log4j.Logger logger) {
		this.logger = logger;
	}
	
	public boolean isDebugEnabled() {
		return this.logger.isDebugEnabled();
	}
	
	public boolean isInfoEnabled() {
		return this.logger.isInfoEnabled();
	}
	
	public boolean isWarnEnabled() {
		return this.logger.isEnabledFor(Level.WARN);
	}
	
	public boolean isErrorEnabled() {
		return this.logger.isEnabledFor(Level.ERROR);
	}
	
	public boolean isFatalEnabled() {
		return this.logger.isEnabledFor(Level.FATAL);
	}
	
	public void debug(String message) {
		this.logger.debug(message);
	}
	
	public void debug(Throwable exception) {
		this.logger.debug("", exception);
	}
	
	public void debug(String message, Throwable exception) {
		this.logger.debug(message, exception);
	}
	
	public void debug(String format, Object... args) {
		this.logger.debug(String.format(format, args));
	}
	
	public void info(String message) {
		this.logger.info(message);
	}
	
	public void info(Throwable exception) {
		this.logger.info("", exception);
	}
	
	public void info(String message, Throwable exception) {
		this.logger.info(message, exception);
	}
	
	public void info(String format, Object... args) {
		this.logger.info(String.format(format, args));
	}
	
	public void warn(String message) {
		this.logger.warn(message);
	}
	
	public void warn(Throwable exception) {
		this.logger.warn("", exception);
	}
	
	public void warn(String message, Throwable exception) {
		this.logger.warn(message, exception);
	}
	
	public void warn(String format, Object... args) {
		this.logger.warn(String.format(format, args));
	}
	
	public void error(String message) {
		this.logger.error(message);
	}
	
	public void error(Throwable exception) {
		this.logger.error("", exception);
	}
	
	public void error(String message, Throwable exception) {
		this.logger.error(message, exception);
	}
	
	public void error(String format, Object... args) {
		this.logger.error(String.format(format, args));
	}
	
	public void fatal(String message) {
		this.logger.fatal(message);
	}
	
	public void fatal(Throwable exception) {
		this.logger.fatal("", exception);
	}
	
	public void fatal(String message, Throwable exception) {
		this.logger.fatal(message, exception);
	}
	
	public void fatal(String format, Object... args) {
		this.logger.fatal(String.format(format, args));
	}
}
