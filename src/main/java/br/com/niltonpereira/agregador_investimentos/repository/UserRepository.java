package br.com.niltonpereira.agregador_investimentos.repository;

import br.com.niltonpereira.agregador_investimentos.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
