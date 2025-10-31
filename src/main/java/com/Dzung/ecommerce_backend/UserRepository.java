package com.Dzung.ecommerce_backend;
import org.springframework.stereotype.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public class UserRepository {
    private List<User> users = new ArrayList<>();
    public UserRepository(){
        users.add(new User(1, "Alice Johnson", 25, "123 Main St, New York", "alice.johnson@example.com", "alice123", "user"));
        users.add(new User(2, "Bob Smith", 30, "456 Elm Ave, Los Angeles", "bob.smith@example.com", "bob456", "admin"));
        users.add(new User(3, "Charlie Brown", 22, "789 Oak St, Chicago", "charlie.brown@example.com", "charlie789", "user"));
        users.add(new User(4, "Diana Prince", 28, "321 Maple Rd, Houston", "diana.prince@example.com", "wonderwoman", "user"));
        users.add(new User(5, "Ethan Hunt", 35, "654 Mission Blvd, San Francisco", "ethan.hunt@example.com", "impossible", "admin"));
        users.add(new User(6, "Fiona Gallagher", 26, "890 Lakeview Dr, Boston", "fiona.gallagher@example.com", "fiona2025", "user"));
        users.add(new User(7, "George Miller", 40, "567 Pine St, Dallas", "george.miller@example.com", "gmiller40", "user"));
        users.add(new User(8, "Hannah Adams", 24, "432 River Rd, Seattle", "hannah.adams@example.com", "hannah123", "user"));
        users.add(new User(9, "Ian Wright", 33, "99 Sunset Blvd, Miami", "ian.wright@example.com", "wright99", "admin"));
        users.add(new User(10, "Julia Roberts", 29, "10 Beverly Hills, Los Angeles", "julia.roberts@example.com", "julia29", "user"));
        users.add(new User(11, "Kevin Hart", 34, "78 Comedy St, Atlanta", "kevin.hart@example.com", "kevinhart", "user"));
        users.add(new User(12, "Laura Green", 27, "45 Garden Ln, Denver", "laura.green@example.com", "greenleaf", "user"));
        users.add(new User(13, "Michael Jordan", 45, "23 Air Rd, Chicago", "michael.jordan@example.com", "mj23goat", "admin"));
        users.add(new User(14, "Nina Lopez", 31, "88 Palm St, Orlando", "nina.lopez@example.com", "nina88", "user"));
        users.add(new User(15, "Oscar Diaz", 38, "19 Ocean View, San Diego", "oscar.diaz@example.com", "oscard38", "user"));
        users.add(new User(16, "Paula White", 23, "76 Hilltop Ave, Austin", "paula.white@example.com", "paula23", "user"));
        users.add(new User(17, "Quincy Davis", 36, "67 Riverbend Dr, Nashville", "quincy.davis@example.com", "qdavis36", "user"));
        users.add(new User(18, "Rachel Kim", 28, "11 Cherry Ln, Portland", "rachel.kim@example.com", "rkim28", "user"));
        users.add(new User(19, "Sam Wilson", 32, "58 Freedom Blvd, Detroit", "sam.wilson@example.com", "falcon32", "admin"));
        users.add(new User(20, "Tina Chen", 26, "25 Lotus Rd, San Jose", "tina.chen@example.com", "tina2025", "user"));
    }
    public List<User> findAll(){
        return users;
    }
    public Optional<User> findById(int id){
        return users.stream().filter(u -> u.getId() == id).findFirst();
    }
    public void save(User user){
        users.add(user);
    }
    public void deleteById(int id){
        users.removeIf(u  -> u.getId() == id);
    }
}
