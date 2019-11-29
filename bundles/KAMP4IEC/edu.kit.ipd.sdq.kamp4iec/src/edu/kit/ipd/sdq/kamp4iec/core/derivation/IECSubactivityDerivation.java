package edu.kit.ipd.sdq.kamp4iec.core.derivation;

import java.util.ArrayList;
import java.util.List;

import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4iec.core.IECActivityElementType;
import edu.kit.ipd.sdq.kamp4iec.core.IECActivityType;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersion;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.DerivedType;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsProperty;
import junit.framework.Protectable;

public class IECSubactivityDerivation {

	//KAMP4IEC does not use subactivities, all kinds Modifications are on the same level. The enriched workplan information is the only kind of subactivities used.
	
	public void deriveSubactivities(Identifier iecComponent, Activity parentActivity, IECArchitectureVersion version) {
		if (iecComponent instanceof GlobalVariable) {
			deriveSubactivity((GlobalVariable) iecComponent, parentActivity, version);
		} else if (iecComponent instanceof FunctionBlock) {
			deriveSubactivity((FunctionBlock) iecComponent, parentActivity, version);
		} else if (iecComponent instanceof Function) {
			deriveSubactivity((Function) iecComponent, parentActivity, version);
		} else if (iecComponent instanceof IECInterface) {
			deriveSubactivity((IECInterface) iecComponent, parentActivity, version);
		} else if (iecComponent instanceof IECMethod) {
			deriveSubactivity((IECMethod) iecComponent, parentActivity, version);
		} else if (iecComponent instanceof IECProperty) {
			deriveSubactivity((IECProperty) iecComponent, parentActivity, version);
		} else if (iecComponent instanceof Program) {
			deriveSubactivity((Program) iecComponent, parentActivity, version);
		}
	}

	private void deriveSubactivity(GlobalVariable globalVariable, Activity parentActivity, IECArchitectureVersion version) {
//		for(Program program : version.getConfiguration().getInstantiatesProgram()) {
//			for(GlobalVariable globVar : program.getDeclaresGlobalVariable()) {
//				if(globalVariable.getId() == globVar.getId()) {
//					addSubActivity(globalVariable, IECActivityElementType.PROGRAM, program, parentActivity);
//				}
//			}
//			for(GlobalVariable globVar : program.getReadsGlobalVariable()) {
//				if(globalVariable.getId() == globVar.getId()) {
//					addSubActivity(globalVariable, IECActivityElementType.PROGRAM, program, parentActivity);
//				}
//			}
//			for(GlobalVariable globVar : program.getWritesGlobalVariable()) {
//				if(globalVariable.getId() == globVar.getId()) {
//					addSubActivity(globalVariable, IECActivityElementType.PROGRAM, program, parentActivity);
//				}
//			}
//		}
//		for(FunctionBlock fb : version.getIECRepository().getContainsFunctionBlock()) {
//			for(GlobalVariable globVar : fb.getReadsGlobalVariable()) {
//				if(globalVariable.getId() == globVar.getId()) {
//					addSubActivity(globalVariable, IECActivityElementType.FUNCTIONBLOCK, fb, parentActivity);
//				}
//			}
//			for(GlobalVariable globVar : fb.getWritesGlobalVariable()) {
//				if(globalVariable.getId() == globVar.getId()) {
//					addSubActivity(globalVariable, IECActivityElementType.FUNCTIONBLOCK, fb, parentActivity);
//				}
//			}
//			for(IECMethod method : fb.getHasMethod()) {
//				for(GlobalVariable globVar : method.getReadsGlobalVariable()) {
//					if(globalVariable.getId() == globVar.getId()) {
//						addSubActivity(globalVariable, IECActivityElementType.METHOD, method, parentActivity);
//					}
//				}
//				for(GlobalVariable globVar : method.getWritesGlobalVariable()) {
//					if(globalVariable.getId() == globVar.getId()) {
//						addSubActivity(globalVariable, IECActivityElementType.METHOD, method, parentActivity);
//					}
//				}
//			}
//		}
//		for(GlobalVariable globVar : version.getConfiguration().getDeclaresGlobalVariable()) {
//			if(globalVariable.getId() == globVar.getId()) {
//				addSubActivity(globalVariable, IECActivityElementType.CONFIGURATION, version.getConfiguration(), parentActivity);
//			}
//		}
	}

	private void deriveSubactivity(FunctionBlock functionBlock, Activity parentActivity, IECArchitectureVersion version) {
//		Configuration configuration = version.getConfiguration();
//		List<GlobalVariable> globVars = new ArrayList<GlobalVariable>();
//		globVars.addAll(configuration.getDeclaresGlobalVariable());
//		for(Program program : configuration.getInstantiatesProgram()) {
//			globVars.addAll(program.getDeclaresGlobalVariable());
//			for(FunctionBlock fb : version.getIECRepository().getContainsFunctionBlock()) {
//				if(functionBlock.getId() == fb.getId()) {
//					addSubActivity(functionBlock, IECActivityElementType.PROGRAM, program, parentActivity);
//				}
//				for(FunctionBlock accessed : fb.getExtendsFunctionBlock()) {
//					if(functionBlock.getId() == accessed.getId()) {
//						addSubActivity(functionBlock, IECActivityElementType.FUNCTIONBLOCK, fb, parentActivity);
//					}
//				}
//				for(FunctionBlock accessed : fb.getInstantiatesFunctionBlock()) {
//					if(functionBlock.getId() == accessed.getId()) {
//						addSubActivity(functionBlock, IECActivityElementType.FUNCTIONBLOCK, fb, parentActivity);
//					}
//				}
//				for(IECMethod method : fb.getHasMethod()) {
//					for(FunctionBlock accessed : method.getInstantiatesFunctionBlock()) {
//						if(functionBlock.getId() == accessed.getId()) {
//							addSubActivity(functionBlock, IECActivityElementType.METHOD, program, parentActivity);
//						}
//					}
//					if (method.getHasDerivedReturnType() != null) {
//						DerivedType accessed = method.getHasDerivedReturnType();
//						if(accessed instanceof FunctionBlock)
//						if(functionBlock.getId() == ((FunctionBlock)accessed).getId()) {
//							addSubActivity(functionBlock, IECActivityElementType.METHOD, program, parentActivity);
//						}
//					}
//				}
//				for(IECProperty property : fb.getHasProperty()) {
//					if (property.getHasDerivedType() != null) {
//						DerivedType accessed = property.getHasDerivedType();
//						if(accessed instanceof FunctionBlock)
//						if(functionBlock.getId() == ((FunctionBlock)accessed).getId()) {
//							addSubActivity(functionBlock, IECActivityElementType.PROPERTY, program, parentActivity);
//						}
//					}
//				}
//			}
//		}
//		for(IECInterface iecinter : version.getIECRepository().getContainsInterface()) {
//			for(IECAbstractMethod method : iecinter.getHasMethod()) {
//				if(method.getHasDerivedReturnType() != null && method.getHasDerivedReturnType() instanceof FunctionBlock && functionBlock.getId().equals((FunctionBlock)method.getHasDerivedReturnType())) {
//					addSubActivity(functionBlock, IECActivityElementType.ABSTRACTMETHOD, method, parentActivity);
//				}
//			}
//			for(IECAbstractProperty property : iecinter.getHasProperty()) {
//				if(property.getHasDerivedType() != null && property.getHasDerivedType() instanceof FunctionBlock && functionBlock.getId().equals((FunctionBlock)property.getHasDerivedType())) {
//					addSubActivity(functionBlock, IECActivityElementType.ABSTRACTPROPERTY, property, parentActivity);
//				}
//			}
//		}
//		for(Function func : version.getIECRepository().getContainsFunction()) {
//			if(func.getHasDerivedReturnType() != null && func.getHasDerivedReturnType() instanceof FunctionBlock && functionBlock.getId().equals((FunctionBlock)func.getHasDerivedReturnType())) {
//				addSubActivity(functionBlock, IECActivityElementType.FUNCTION, func, parentActivity);
//			}
//			for(FunctionBlock fb : func.getCallsFunctionBlockConstructor()) {
//				if(fb.getId().equals(functionBlock.getId())) {
//					addSubActivity(functionBlock, IECActivityElementType.FUNCTION, func, parentActivity);
//				}
//			}
//		}
//		for(GlobalVariable globVar : globVars) {
//			if(globVar.getHasDerivedType() != null && globVar.getHasDerivedType() instanceof FunctionBlock && functionBlock.getId().equals(((FunctionBlock)globVar.getHasDerivedType()).getId())) {
//				addSubActivity(functionBlock, IECActivityElementType.GLOBALVARIABLE, globVar, parentActivity);
//			}
//		}
	}

	private void deriveSubactivity(Function function, Activity parentActivity, IECArchitectureVersion version) {
//		Configuration configuration = version.getConfiguration();
//		for(Program prog : configuration.getInstantiatesProgram()) {
//			for(Function func : prog.getCallsFunction()) {
//				if(func.getId() == function.getId()) {
//					addSubActivity(function, IECActivityElementType.PROGRAM, prog, parentActivity);
//				}
//			}
//		}
//		for(Function func : version.getIECRepository().getContainsFunction()) {
//			if(func.getId() == function.getId()) {
//				addSubActivity(function, IECActivityElementType.FUNCTION, func, parentActivity);
//			}
//		}
//		for(FunctionBlock fb : version.getIECRepository().getContainsFunctionBlock()) {
//			for(Function func : fb.getCallsFunction()) {
//				if(func.getId() == function.getId()) {
//					addSubActivity(function, IECActivityElementType.FUNCTIONBLOCK, fb, parentActivity);
//				}
//			}
//			for(IECMethod method : fb.getHasMethod()) {
//				for(Function func : method.getCallsFunction()) {
//					if(func.getId() == function.getId()) {
//						addSubActivity(function, IECActivityElementType.METHOD, method, parentActivity);
//					}
//				}
//			}
//		}
	}

	private void deriveSubactivity(IECInterface iecInterface, Activity parentActivity, IECArchitectureVersion version) {
//		Configuration configuration = version.getConfiguration();
//		List<GlobalVariable> globVars = new ArrayList<GlobalVariable>();
//		globVars.addAll(configuration.getDeclaresGlobalVariable());
//		for(Program prog : configuration.getInstantiatesProgram()) {
//			globVars.addAll(prog.getDeclaresGlobalVariable());
//			for(IECInterface iecInter : prog.getInstantiatesInterface()) {
//				if(iecInter.getId() == iecInterface.getId()) {
//					addSubActivity(iecInterface, IECActivityElementType.PROGRAM, prog, parentActivity);
//				}
//			}
//		}
//		for(Function func : version.getIECRepository().getContainsFunction()) {
//			if(func.getHasDerivedReturnType() != null && func.getHasDerivedReturnType() instanceof IECInterface && iecInterface.getId().equals(((Function)func.getHasDerivedReturnType()).getId())) {
//				addSubActivity(iecInterface, IECActivityElementType.FUNCTION, (Function)func.getHasDerivedReturnType(), parentActivity);
//			}
//		}
//		for(FunctionBlock fb : version.getIECRepository().getContainsFunctionBlock()) {
//			for(IECInterface iecInter : fb.getImplements()) {
//				if(iecInter.getId() == iecInterface.getId())
//					addSubActivity(iecInterface, IECActivityElementType.FUNCTIONBLOCK, fb, parentActivity);
//			}
//			for(IECInterface iecInter : fb.getInstantiatesInterface()) {
//				if(iecInter.getId() == iecInterface.getId())
//					addSubActivity(iecInterface, IECActivityElementType.FUNCTIONBLOCK, fb, parentActivity);
//			}
//			for(IECMethod method : fb.getHasMethod()) {
//				for(IECInterface iecInter : method.getInstantiatesInterface()) {
//					if(iecInter.getId() == iecInterface.getId())
//						addSubActivity(iecInterface, IECActivityElementType.METHOD, method, parentActivity);
//				}
//				if(method.getHasDerivedReturnType() != null && method.getHasDerivedReturnType() instanceof IECInterface && iecInterface.getId().equals(((IECInterface)method.getHasDerivedReturnType()).getId())) {
//					addSubActivity(iecInterface, IECActivityElementType.METHOD, method, parentActivity);					
//				}
//			}
//			for(IECProperty prop : fb.getHasProperty()) {
//				if(prop.getHasDerivedType() != null && prop.getHasDerivedType() instanceof IECInterface && ((IECInterface)prop.getHasDerivedType()).getId().equals(iecInterface.getId())) {
//					addSubActivity(iecInterface, IECActivityElementType.PROPERTY, prop, parentActivity);
//				}
//			}
//		}
//		for(IECInterface iecInter : version.getIECRepository().getContainsInterface()) {
//			if(iecInter.getExtendsInterface() != null && iecInterface.getId().equals(iecInter.getExtendsInterface().getId())) {
//				addSubActivity(iecInterface, IECActivityElementType.INTERFACE, iecInter, parentActivity);
//			}
//			for(IECAbstractMethod method : iecInter.getHasMethod()) {
//				if(method.getHasDerivedReturnType() != null && method.getHasDerivedReturnType() instanceof IECInterface && iecInterface.getId().equals(((IECInterface)method.getHasDerivedReturnType()).getId())) {
//					addSubActivity(iecInterface, IECActivityElementType.ABSTRACTMETHOD, method, parentActivity);
//				}
//			}
//			for(IECAbstractProperty property : iecInter.getHasProperty()) {
//				if(property.getHasDerivedType() != null && property.getHasDerivedType() instanceof IECInterface && iecInterface.getId().equals(((IECInterface)property.getHasDerivedType()).getId())) {
//					addSubActivity(iecInterface, IECActivityElementType.ABSTRACTPROPERTY, property, parentActivity);
//				}
//			}
//		}
//		for(GlobalVariable globVar : globVars) {
//			if(globVar.getHasDerivedType() != null && globVar.getHasDerivedType() instanceof IECInterface && iecInterface.getId().equals(((IECInterface)globVar.getHasDerivedType()).getId())) {
//				addSubActivity(iecInterface, IECActivityElementType.GLOBALVARIABLE, globVar, parentActivity);
//			}
//		}
	}

	private void deriveSubactivity(IECAbstractMethod abstractMethod, Activity parentActivity, IECArchitectureVersion version) {
//		Configuration configuration = version.getConfiguration();
//		for(Program prog : configuration.getInstantiatesProgram()) {
//			for(IECAbstractMethod method : filterAbstractMethods(prog.getCallsMethod())) {
//				if(abstractMethod.getId().equals(method.getId())) {
//					addSubActivity(abstractMethod, IECActivityElementType.PROGRAM, prog, parentActivity);
//				}
//			}
//		}
//		for(FunctionBlock fb : version.getIECRepository().getContainsFunctionBlock()) {
//			for(IECAbstractMethod method : filterAbstractMethods(fb.getCallsMethod())) {
//				if(abstractMethod.getId().equals(method.getId())) {
//					addSubActivity(abstractMethod, IECActivityElementType.FUNCTIONBLOCK, fb, parentActivity);
//				}
//			}
//			for(IECMethod method : fb.getHasMethod()) {
//				if(abstractMethod.getId().equals(method.getImplements().getId())) {
//					addSubActivity(abstractMethod, IECActivityElementType.METHOD, method, parentActivity);
//				}				
//			}
//		}
//		for(IECInterface inter : version.getIECRepository().getContainsInterface()) {
//			for(IECAbstractMethod absMethod : inter.getHasMethod()) {
//				if(abstractMethod.getId().equals(absMethod.getId())) {
//					addSubActivity(abstractMethod, IECActivityElementType.INTERFACE, inter, parentActivity);
//				}	
//			}
//		}
	}

	private void deriveSubactivity(IECAbstractProperty abstractProperty, Activity parentActivity, IECArchitectureVersion version) {
//		Configuration configuration = version.getConfiguration();
//		for(Program prog : configuration.getInstantiatesProgram()) {
//			for(IECAbstractProperty property : filterAbstractProperties(prog.getReadsProperty())) {
//				if(abstractProperty.getId().equals(property.getId())) {
//					addSubActivity(abstractProperty, IECActivityElementType.PROGRAM, prog, parentActivity);
//				}
//			}
//			for(IECAbstractProperty property : filterAbstractProperties(prog.getWritesProperty())) {
//				if(abstractProperty.getId().equals(property.getId())) {
//					addSubActivity(abstractProperty, IECActivityElementType.PROGRAM, prog, parentActivity);
//				}
//			}
//		}
//		for(FunctionBlock fb : version.getIECRepository().getContainsFunctionBlock()) {
//			for(IECAbstractProperty property : filterAbstractProperties(fb.getReadsProperty())) {
//				if(abstractProperty.getId().equals(property.getId())) {
//					addSubActivity(abstractProperty, IECActivityElementType.FUNCTIONBLOCK, fb, parentActivity);
//				}
//			}
//			for(IECAbstractProperty property : filterAbstractProperties(fb.getWritesProperty())) {
//				if(abstractProperty.getId().equals(property.getId())) {
//					addSubActivity(abstractProperty, IECActivityElementType.FUNCTIONBLOCK, fb, parentActivity);
//				}
//			}
//			for(IECProperty property : fb.getHasProperty()) {
//				if(abstractProperty.getId().equals(property.getImplements().getId())) {
//					addSubActivity(abstractProperty, IECActivityElementType.PROPERTY, property, parentActivity);
//				}				
//			}
//		}
//		for(IECInterface inter : version.getIECRepository().getContainsInterface()) {
//			for(IECAbstractProperty absMethod : inter.getHasProperty()) {
//				if(abstractProperty.getId().equals(absMethod.getId())) {
//					addSubActivity(abstractProperty, IECActivityElementType.INTERFACE, inter, parentActivity);
//				}	
//			}
//		}
	}

	private void deriveSubactivity(IECMethod iecMethod, Activity parentActivity, IECArchitectureVersion version) {
//		Configuration configuration = version.getConfiguration();
//		for(Program prog : configuration.getInstantiatesProgram()) {
//			for(IECMethod method : filterMethods(prog.getCallsMethod())) {
//				if(method.getId().equals(iecMethod.getId())) {
//					addSubActivity(iecMethod, IECActivityElementType.PROGRAM, prog, parentActivity);
//				}
//			}
//		}
//		for(FunctionBlock fb : version.getIECRepository().getContainsFunctionBlock()) {
//			for(IECMethod method : filterMethods(fb.getCallsMethod())) {
//				if(method.getId().equals(iecMethod.getId())) {
//					addSubActivity(iecMethod, IECActivityElementType.FUNCTIONBLOCK, fb, parentActivity);
//				}
//			}
//			for(IECMethod calling : fb.getHasMethod()) {
//				for(IECMethod accessed : filterMethods(calling.getCallsMethod())) {
//					if(accessed.getId().equals(iecMethod.getId())) {
//						addSubActivity(iecMethod, IECActivityElementType.METHOD, accessed, parentActivity);
//					}
//				}
//			}
//		}
	}

	private void deriveSubactivity(IECProperty iecProperty, Activity parentActivity, IECArchitectureVersion version) {
//		Configuration configuration = version.getConfiguration();
//		for(Program prog : configuration.getInstantiatesProgram()) {
//			for(IECProperty property : filterProperties(prog.getReadsProperty())) {
//				if(property.getId().equals(iecProperty.getId())) {
//					addSubActivity(iecProperty, IECActivityElementType.PROGRAM, prog, parentActivity);
//				}
//			}
//			for(IECProperty property : filterProperties(prog.getWritesProperty())) {
//				if(property.getId().equals(iecProperty.getId())) {
//					addSubActivity(iecProperty, IECActivityElementType.PROGRAM, prog, parentActivity);
//				}
//			}
//		}
//		for(FunctionBlock fb : version.getIECRepository().getContainsFunctionBlock()) {
//			for(IECProperty property : filterProperties(fb.getReadsProperty())) {
//				if(property.getId().equals(iecProperty.getId())) {
//					addSubActivity(iecProperty, IECActivityElementType.FUNCTIONBLOCK, fb, parentActivity);
//				}
//			}
//			for(IECProperty property : filterProperties(fb.getWritesProperty())) {
//				if(property.getId().equals(iecProperty.getId())) {
//					addSubActivity(iecProperty, IECActivityElementType.FUNCTIONBLOCK, fb, parentActivity);
//				}
//			}
//			for(IECMethod calling : fb.getHasMethod()) {
//				for(IECProperty property : filterProperties(calling.getReadsProperty())) {
//					if(property.getId().equals(iecProperty.getId())) {
//						addSubActivity(iecProperty, IECActivityElementType.METHOD, calling, parentActivity);
//					}
//				}
//				for(IECProperty property : filterProperties(calling.getWritesProperty())) {
//					if(property.getId().equals(iecProperty.getId())) {
//						addSubActivity(iecProperty, IECActivityElementType.METHOD, calling, parentActivity);
//					}
//				}
//			}
//		}
	}
	
	private void deriveSubactivity(Program program, Activity parentActivity, IECArchitectureVersion version) {
//		for(Program prog : version.getConfiguration().getInstantiatesProgram()) {
//			if(prog.getId().equals(program.getId())) {
//				addSubActivity(program, IECActivityElementType.CONFIGURATION, version.getConfiguration(), parentActivity);
//			}
//		}
	}
		
	
	private List<IECMethod> filterMethods(List<IsMethod> toFilter) {
		List<IECMethod> toReturn = new ArrayList<>();
		for(IsMethod method : toFilter) {
			if(method instanceof IECMethod)
				toReturn.add((IECMethod)method);
		}
		return toReturn;
	}
	
	private List<IECAbstractMethod> filterAbstractMethods(List<IsMethod> toFilter) {
		List<IECAbstractMethod> toReturn = new ArrayList<>();
		for(IsMethod method : toFilter) {
			if(method instanceof IECAbstractMethod)
				toReturn.add((IECAbstractMethod)method);
		}
		return toReturn;
	}
	
	private List<IECProperty> filterProperties(List<IsProperty> toFilter) {
		List<IECProperty> toReturn = new ArrayList<>();
		for(IsProperty property : toFilter) {
			if(property instanceof IECProperty)
				toReturn.add((IECProperty)property);
		}
		return toReturn;
	}
	
	private List<IECAbstractProperty> filterAbstractProperties(List<IsProperty> toFilter) {
		List<IECAbstractProperty> toReturn = new ArrayList<>();
		for(IsProperty property : toFilter) {
			if(property instanceof IECAbstractProperty)
				toReturn.add((IECAbstractProperty)property);
		}
		return toReturn;
	}
	
	private Activity addSubActivity(GlobalVariable globalVariable, IECActivityElementType elementType, IECComponent parentElement, Activity parentActivity) {
		Activity result = new Activity(IECActivityType.ARCHITECTUREMODELDIFF, elementType, globalVariable, globalVariable.getId(), null, parentActivity.getBasicActivity(), 
				generateDescription(parentElement, globalVariable, parentActivity.getBasicActivity()));
		parentActivity.addSubActivity(result);
		return parentActivity;
	}

	private Activity addSubActivity(FunctionBlock functionBlock, IECActivityElementType elementType, IECComponent parentElement, Activity parentActivity) {
		Activity result = new Activity(IECActivityType.ARCHITECTUREMODELDIFF, elementType, functionBlock, functionBlock.getId(), null, parentActivity.getBasicActivity(), 
				generateDescription(parentElement, functionBlock, parentActivity.getBasicActivity()));
		parentActivity.addSubActivity(result);
		return parentActivity;
	}

	private Activity addSubActivity(Function function, IECActivityElementType elementType, IECComponent parentElement, Activity parentActivity) {
		Activity result = new Activity(IECActivityType.ARCHITECTUREMODELDIFF, elementType, function, function.getId(), null, parentActivity.getBasicActivity(), 
				generateDescription(parentElement, function, parentActivity.getBasicActivity()));
		parentActivity.addSubActivity(result);
		return parentActivity;
	}

	private Activity addSubActivity(IECInterface iecInterface, IECActivityElementType elementType, IECComponent parentElement, Activity parentActivity) {
		Activity result = new Activity(IECActivityType.ARCHITECTUREMODELDIFF, elementType, iecInterface, iecInterface.getId(), null, parentActivity.getBasicActivity(), 
				generateDescription(parentElement, iecInterface, parentActivity.getBasicActivity()));
		parentActivity.addSubActivity(result);
		return parentActivity;
	}

	private Activity addSubActivity(IECAbstractProperty property, IECActivityElementType elementType, IECComponent parentElement, Activity parentActivity) {
		Activity result = new Activity(IECActivityType.ARCHITECTUREMODELDIFF, elementType, property, property.getId(), null, parentActivity.getBasicActivity(), 
				generateDescription(parentElement, property, parentActivity.getBasicActivity()));
		parentActivity.addSubActivity(result);
		return parentActivity;
	}

	private Activity addSubActivity(IECAbstractMethod method, IECActivityElementType elementType, IECComponent parentElement, Activity parentActivity) {
		Activity result = new Activity(IECActivityType.ARCHITECTUREMODELDIFF, elementType, method, method.getId(), null, parentActivity.getBasicActivity(), 
				generateDescription(parentElement, method, parentActivity.getBasicActivity()));
		parentActivity.addSubActivity(result);
		return parentActivity;
	}

	private Activity addSubActivity(Program program, IECActivityElementType elementType, IECComponent parentElement, Activity parentActivity) {
		Activity result = new Activity(IECActivityType.ARCHITECTUREMODELDIFF, elementType, program, program.getId(), null, parentActivity.getBasicActivity(), 
				generateDescription(parentElement, program, parentActivity.getBasicActivity()));
		parentActivity.addSubActivity(result);
		return parentActivity;
	}

	private Activity addSubActivity(IECProperty property, IECActivityElementType elementType, IECComponent parentElement, Activity parentActivity) {
		Activity result = new Activity(IECActivityType.ARCHITECTUREMODELDIFF, elementType, property, property.getId(), null, parentActivity.getBasicActivity(), 
				generateDescription(parentElement, property, parentActivity.getBasicActivity()));
		parentActivity.addSubActivity(result);
		return parentActivity;
	}

	private Activity addSubActivity(IECMethod method, IECActivityElementType elementType, IECComponent parentElement, Activity parentActivity) {
		Activity result = new Activity(IECActivityType.ARCHITECTUREMODELDIFF, elementType, method, method.getId(), null, parentActivity.getBasicActivity(), 
				generateDescription(parentElement, method, parentActivity.getBasicActivity()));
		parentActivity.addSubActivity(result);
		return parentActivity;
	}

	public static String generateDescription(Identifier superElement, Identifier subElement, BasicActivity action) {
		String result = "";
		if (action.equals(BasicActivity.ADD)) {
			result += "Add ";
		} else if (action.equals(BasicActivity.REMOVE)) {
			result += "Remove ";
		} else if (action.equals(BasicActivity.MODIFY)) {
			result += "Modify ";
		}
		result += subElement.eClass().getName() + " " + subElement.getId();
		if (action.equals(BasicActivity.ADD)) {
			result += " to ";
		} else if (action.equals(BasicActivity.REMOVE)) {
			result += " from ";
		} else if (action.equals(BasicActivity.MODIFY)) {
			result += " of ";
		}
		result += superElement.eClass().getName() + " " + superElement.getId() + ".";
		return result;
	}

}