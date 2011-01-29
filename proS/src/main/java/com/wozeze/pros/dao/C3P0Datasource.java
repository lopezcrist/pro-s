package com.wozeze.pros.dao;

import java.beans.PropertyVetoException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Datasource implements DataSource {

	private ComboPooledDataSource comboPooledDataSource;
	private String driverClass;
	private String jdbcUrl;
	private String user;
	private String password;
	private boolean autoCommitOnClose;
	private int checkoutTimeout;
	private int initialPoolSize;
	private int minPoolSize;
	private int maxPoolSize;
	private int maxIdleTime;
	private int acquireIncrement;
	private int maxIdleTimeExcessConnections;
	
	public C3P0Datasource(ComboPooledDataSource _comboPooledDataSource) throws PropertyVetoException{
		_comboPooledDataSource.setDriverClass(driverClass);
		_comboPooledDataSource.setJdbcUrl(jdbcUrl);
		_comboPooledDataSource.setUser(user);
		_comboPooledDataSource.setPassword(password);
		_comboPooledDataSource.setAutoCommitOnClose(autoCommitOnClose);
		_comboPooledDataSource.setCheckoutTimeout(checkoutTimeout);
		_comboPooledDataSource.setInitialPoolSize(initialPoolSize);
		_comboPooledDataSource.setMinPoolSize(minPoolSize);
		_comboPooledDataSource.setMaxPoolSize(maxPoolSize);
		_comboPooledDataSource.setAcquireIncrement(acquireIncrement);
		_comboPooledDataSource.setMaxIdleTimeExcessConnections(maxIdleTimeExcessConnections);
		comboPooledDataSource = _comboPooledDataSource;
	}

	@Override
	public Connection getConnection() throws SQLException {
		return comboPooledDataSource.getConnection();
	}

	@Override
	public Connection getConnection(String username, String password)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getDriverClass() {
		return driverClass;
	}

	public void setDriverClass(String driverClass) throws PropertyVetoException {
		this.comboPooledDataSource.setDriverClass(driverClass);
	}

	public ComboPooledDataSource getComboPooledDataSource() {
		return comboPooledDataSource;
	}

	public void setComboPooledDataSource(ComboPooledDataSource comboPooledDataSource) {
		this.comboPooledDataSource = comboPooledDataSource;
	}

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.comboPooledDataSource.setJdbcUrl(jdbcUrl);
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.comboPooledDataSource.setUser(user);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.comboPooledDataSource.setPassword(password);
	}

	public boolean isAutoCommitOnClose() {
		return autoCommitOnClose;
	}

	public void setAutoCommitOnClose(boolean autoCommitOnClose) {
		this.comboPooledDataSource.setAutoCommitOnClose(autoCommitOnClose);
	}

	public int getCheckoutTimeout() {
		return checkoutTimeout;
	}

	public void setCheckoutTimeout(int checkoutTimeout) {
		this.comboPooledDataSource.setCheckoutTimeout(checkoutTimeout);
	}

	public int getInitialPoolSize() {
		return initialPoolSize;
	}

	public void setInitialPoolSize(int initialPoolSize) {
		this.comboPooledDataSource.setInitialPoolSize(initialPoolSize);
	}

	public int getMinPoolSize() {
		return minPoolSize;
	}

	public void setMinPoolSize(int minPoolSize) {
		this.comboPooledDataSource.setMinPoolSize(minPoolSize);
	}

	public int getMaxPoolSize() {
		return maxPoolSize;
	}

	public void setMaxPoolSize(int maxPoolSize) {
		this.comboPooledDataSource.setMaxPoolSize(maxPoolSize);
	}

	public int getMaxIdleTime() {
		return maxIdleTime;
	}

	public void setMaxIdleTime(int maxIdleTime) {
		this.comboPooledDataSource.setMaxIdleTime(maxIdleTime);
	}

	public int getAcquireIncrement() {
		return acquireIncrement;
	}

	public void setAcquireIncrement(int acquireIncrement) {
		this.comboPooledDataSource.setAcquireIncrement(acquireIncrement);
	}

	public int getMaxIdleTimeExcessConnections() {
		return maxIdleTimeExcessConnections;
	}

	public void setMaxIdleTimeExcessConnections(int maxIdleTimeExcessConnections) {
		this.comboPooledDataSource.setMaxIdleTimeExcessConnections(maxIdleTimeExcessConnections);
	}
	
	
}
