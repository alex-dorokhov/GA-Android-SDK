    /* 
       Game Analytics Android Wrapper
       Copyright (c) 2013 Tim Wicksteed <tim@twicecircled.com>
       http:/www.gameanalytics.com

       Licensed under the Apache License, Version 2.0 (the "License");
       you may not use this file except in compliance with the License.
       You may obtain a copy of the License at

           http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing, software
       distributed under the License is distributed on an "AS IS" BASIS,
       WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
       See the License for the specific language governing permissions and
       limitations under the License.
    */ 

package com.gameanalytics.android;

public class UserEvent {
	// GENERAL
	private String user_id;
	private String session_id;
	private String build;
	private String event_id;
	private String area;
	private float x;
	private float y;
	private float z;

	// USER
	private char gender;
	private int birth_year;
	private int friend_count;

	public UserEvent(String user_id, String session_id, String build,
			String event_id, String area, float x, float y, float z,
			char gender, int birth_year, int friend_count) {
		this.user_id = user_id;
		this.session_id = session_id;
		this.build = build;
		this.event_id = event_id;
		this.area = area;
		this.x = x;
		this.y = y;
		this.z = z;

		this.gender = gender;
		this.birth_year = birth_year;
		this.friend_count = friend_count;
	}
}
