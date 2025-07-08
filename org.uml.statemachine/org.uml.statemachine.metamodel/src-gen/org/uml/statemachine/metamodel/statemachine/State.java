/**
 */
package org.uml.statemachine.metamodel.statemachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.uml.statemachine.metamodel.statemachine.State#getName <em>Name</em>}</li>
 *   <li>{@link org.uml.statemachine.metamodel.statemachine.State#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link org.uml.statemachine.metamodel.statemachine.State#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link org.uml.statemachine.metamodel.statemachine.State#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see org.uml.statemachine.metamodel.statemachine.StatemachinePackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.uml.statemachine.metamodel.statemachine.StatemachinePackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.uml.statemachine.metamodel.statemachine.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Initial</em>' attribute.
	 * @see #setIsInitial(boolean)
	 * @see org.uml.statemachine.metamodel.statemachine.StatemachinePackage#getState_IsInitial()
	 * @model
	 * @generated
	 */
	boolean isIsInitial();

	/**
	 * Sets the value of the '{@link org.uml.statemachine.metamodel.statemachine.State#isIsInitial <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Initial</em>' attribute.
	 * @see #isIsInitial()
	 * @generated
	 */
	void setIsInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Final</em>' attribute.
	 * @see #setIsFinal(boolean)
	 * @see org.uml.statemachine.metamodel.statemachine.StatemachinePackage#getState_IsFinal()
	 * @model
	 * @generated
	 */
	boolean isIsFinal();

	/**
	 * Sets the value of the '{@link org.uml.statemachine.metamodel.statemachine.State#isIsFinal <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final</em>' attribute.
	 * @see #isIsFinal()
	 * @generated
	 */
	void setIsFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link org.uml.statemachine.metamodel.statemachine.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see org.uml.statemachine.metamodel.statemachine.StatemachinePackage#getState_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransition();

} // State
