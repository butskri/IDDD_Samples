//   Copyright 2012,2013 Vaughn Vernon
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.

package com.saasovation.agilepm.domain.model.product.backlogitem;

public enum TaskStatus {

	NOT_STARTED {
		@Override
		public boolean isNotStarted() {
			return true;
		}
	},

	IN_PROGRESS {
		@Override
		public boolean isInProgress() {
			return true;
		}
	},

	IMPEDED {
		@Override
		public boolean isImpeded() {
			return true;
		}
	},

	DONE {
		@Override
		public boolean isDone() {
			return true;
		}
	};

	public boolean isDone() {
		return false;
	}

	public boolean isImpeded() {
		return false;
	}

	public boolean isInProgress() {
		return false;
	}

	public boolean isNotStarted() {
		return false;
	}
}
