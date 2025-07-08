/**
 */
package org.uml.statemachine.metamodel.statemachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.uml.statemachine.metamodel.statemachine.StateMachine#getName <em>Name</em>}</li>
 *   <li>{@link org.uml.statemachine.metamodel.statemachine.StateMachine#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.uml.statemachine.metamodel.statemachine.StateMachine#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.uml.statemachine.metamodel.statemachine.StatemachinePackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.uml.statemachine.metamodel.statemachine.StatemachinePackage#getStateMachine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.uml.statemachine.metamodel.statemachine.StateMachine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link org.uml.statemachine.metamodel.statemachine.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see org.uml.statemachine.metamodel.statemachine.StatemachinePackage#getStateMachine_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransition();

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link org.uml.statemachine.metamodel.statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see org.uml.statemachine.metamodel.statemachine.StatemachinePackage#getStateMachine_State()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getState();

} // StateMachine
