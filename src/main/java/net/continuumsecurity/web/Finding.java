/*******************************************************************************
 *    BDD-Security, application security testing framework
 * 
 * Copyright (C) `2012 Stephen de Vries`
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see `<http://www.gnu.org/licenses/>`.
 ******************************************************************************/
package net.continuumsecurity.web;

class Finding {
	FindingType id;
	String url;
	String detail;
	String messages[];
	
	public Finding(FindingType id) {
		this.id = id;
	}
	
	public Finding(FindingType id,String url,String detail) {
		this.id = id;
		this.url = url;
		this.detail = detail;
	}
	
	public Finding(FindingType id,String url,String detail,String[] messages) {
		this.id = id;
		this.url = url;
		this.detail = detail;
		this.messages = messages;
	}
}
