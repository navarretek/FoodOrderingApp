package Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Spring.beans.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

	
}
