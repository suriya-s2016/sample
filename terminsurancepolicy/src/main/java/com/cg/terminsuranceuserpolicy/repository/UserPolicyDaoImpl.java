package com.cg.terminsuranceuserpolicy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.terminsuranceuserpolicy.entity.UserPolicy;

@Repository
public interface UserPolicyDaoImpl extends JpaRepository<UserPolicy,Integer> {
 @Query(value="select * from user_policy where user_policy_id=?1",nativeQuery=true)
  UserPolicy findByUserPolicyId(int userpolicyid);
}
