package ma.bassma.projetangular.repositories;

import ma.bassma.projetangular.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String > {

}
