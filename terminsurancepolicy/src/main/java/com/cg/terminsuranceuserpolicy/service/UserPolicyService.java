package com.cg.terminsuranceuserpolicy.service;


import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cg.terminsuranceuserpolicy.entity.UserPolicy;
import com.cg.terminsuranceuserpolicy.exception.ResourceNotFoundException;
/** This class elaborates on service interface
* 
* @author Group-5
* 
*/
public interface UserPolicyService {
	/**This method is to add policy*/
	public UserPolicy addUserPolicy(UserPolicy policy);
	/**This method is to get one particular policy using policy id primary key value */
	public ResponseEntity<UserPolicy> getUserPolicyById(Integer policyId) throws ResourceNotFoundException;
	/**This method is to get all the policies of one particular user */
	public ResponseEntity<List<UserPolicy>> getUserPolicyByUserId(Integer policyId) throws ResourceNotFoundException;
	public List<UserPolicy> getAllUserPolicies();
	public UserPolicy findUserPolicyById(Integer userpolicyid) throws ResourceNotFoundException;
	public UserPolicy saveUserPolicy(UserPolicy user);
	public UserPolicy updateUserPolicy(Integer userpolicyid, UserPolicy user) throws ResourceNotFoundException;
	public Boolean deleteUserPolicyById(Integer userpolicyid) throws ResourceNotFoundException;

}
