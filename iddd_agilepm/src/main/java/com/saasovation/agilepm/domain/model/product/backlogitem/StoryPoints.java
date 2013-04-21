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

public enum StoryPoints {

	ZERO {
		@Override
		public int pointValue() {
			return 0;
		}
	},

	ONE {
		@Override
		public int pointValue() {
			return 1;
		}
	},

	TWO {
		@Override
		public int pointValue() {
			return 2;
		}
	},

	THREE {
		@Override
		public int pointValue() {
			return 3;
		}
	},

	FIVE {
		@Override
		public int pointValue() {
			return 5;
		}
	},

	EIGHT {
		@Override
		public int pointValue() {
			return 8;
		}
	},

	THIRTEEN {
		@Override
		public int pointValue() {
			return 13;
		}
	},

	TWENTY {
		@Override
		public int pointValue() {
			return 20;
		}
	},

	FORTY {
		@Override
		public int pointValue() {
			return 40;
		}
	},

	ONE_HUNDRED {
		@Override
		public int pointValue() {
			return 100;
		}
	};

	public abstract int pointValue();
}
