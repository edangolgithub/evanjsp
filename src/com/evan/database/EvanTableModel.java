package com.evan.database;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class EvanTableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<List<String>> rows;
	private List<String> columnNames;

	public EvanTableModel(List<String> columnNames, List<List<String>> rows) {
		this.rows = new ArrayList<>(rows);
		this.columnNames = columnNames;
	}

	@Override
	public int getRowCount() {
		return rows.size();
	}

	@Override
	public int getColumnCount() {
		return columnNames.size();
	}

	@Override
	public String getColumnName(int column) {
		return columnNames.get(column);
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		Class type = String.class;
		return type;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		List<String> rowData = rows.get(rowIndex);
		return rowData.get(columnIndex);
	}
}
