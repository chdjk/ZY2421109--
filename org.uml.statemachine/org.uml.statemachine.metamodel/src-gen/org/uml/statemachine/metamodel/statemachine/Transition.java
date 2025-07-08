/**
 */
package org.uml.statemachine.metamodel.statemachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.uml.statemachine.metamodel.statemachine.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.uml.statemachine.metamodel.statemachine.Transition#getEvent <em>Event</em>}</li>
 *   <li>{@link org.uml.statemachine.metamodel.statemachine.Transition#getAction <em>Action</em>}</li>
 *   <li>{@link org.uml.statemachine.metamodel.statemachine.Transition#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.uml.statemachine.metamodel.statemachine.StatemachinePackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' attribute.
	 * @see #setGuard(String)
	 * @see org.uml.statemachine.metamodel.statemachine.StatemachinePackage#getTransition_Guard()
	 * @model
	 * @generated
	 */
	String getGuard();

	/**
	 * Sets the value of the '{@link org.uml.statemachine.metamodel.statemachine.Transition#getGuard <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' attribute.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(String value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see org.uml.statemachine.metamodel.statemachine.StatemachinePackage#getTransition_Event()
	 * @model
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link org.uml.statemachine.metamodel.statemachine.Transition#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see org.uml.statemachine.metamodel.statemachine.StatemachinePackage#getTransition_Action()
	 * @model
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link org.uml.statemachine.metamodel.statemachine.Transition#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see org.uml.statemachine.metamodel.statemachine.StatemachinePackage#getTransition_State()
	 * @model
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link org.uml.statemachine.metamodel.statemachine.Transition#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // Transition
