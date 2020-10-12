/*
 * Copyright 2020-present quick-spring-boot All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.quick.spring.boot.business.rest.response;


import com.github.quick.spring.boot.business.model.vo.ResultVo;

public enum ErrorResponse {
	SAVE_FAIL(500, "保存失败"),
	UPDATE_FAIL(500, "更新失败"),
	;

	private final int code;

	private final String message;

	ErrorResponse(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}


	public <T> ResultVo<T> ret(T data) {
		return new ResultVo<>(this.code, this.message, data);
	}

}
