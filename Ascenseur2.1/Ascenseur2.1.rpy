I-Logix-RPY-Archive version 8.10.0 Java 6930133
{ IProject 
	- _id = GUID 0f43c63d-a9bc-474e-bab1-9f27dec24da6;
	- _myState = 8192;
	- _name = "Ascenseur2.1";
	- _modifiedTimeWeak = 2.2.2016::22:50:37;
	- _lastID = 1;
	- _UserColors = { IRPYRawContainer 
		- size = 16;
		- value = 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 
	}
	- _defaultSubsystem = { ISubsystemHandle 
		- _m2Class = "ISubsystem";
		- _filename = "Ascenseur.sbs";
		- _subsystem = "";
		- _class = "";
		- _name = "Ascenseur";
		- _id = GUID 852e0fc5-6221-44f5-9d4d-9afcb6d4a5cb;
	}
	- _component = { IHandle 
		- _m2Class = "IComponent";
		- _filename = "DefaultComponent.cmp";
		- _subsystem = "";
		- _class = "";
		- _name = "DefaultComponent";
		- _id = GUID 84773c11-022d-40fd-bdb0-c1ae1274da02;
	}
	- Multiplicities = { IRPYRawContainer 
		- size = 4;
		- value = 
		{ IMultiplicityItem 
			- _name = "1";
			- _count = 6;
		}
		{ IMultiplicityItem 
			- _name = "*";
			- _count = -1;
		}
		{ IMultiplicityItem 
			- _name = "0,1";
			- _count = -1;
		}
		{ IMultiplicityItem 
			- _name = "1..*";
			- _count = -1;
		}
	}
	- Subsystems = { IRPYRawContainer 
		- size = 2;
		- value = 
		{ ISubsystem 
			- fileName = "Ascenseur";
			- _id = GUID 852e0fc5-6221-44f5-9d4d-9afcb6d4a5cb;
		}
		{ IProfile 
			- fileName = "JavaDocProfile";
			- _persistAs = "$OMROOT\\Profiles\\JavaDoc\\";
			- _id = GUID 19700e28-456f-4c97-a19c-b95dcb3e9dff;
			- _isReference = 1;
		}
	}
	- Diagrams = { IRPYRawContainer 
		- size = 0;
	}
	- MSCS = { IRPYRawContainer 
		- size = 0;
	}
	- Components = { IRPYRawContainer 
		- size = 1;
		- value = 
		{ IComponent 
			- fileName = "DefaultComponent";
			- _id = GUID 84773c11-022d-40fd-bdb0-c1ae1274da02;
		}
	}
}

