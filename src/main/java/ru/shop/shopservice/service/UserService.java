package ru.shop.shopservice.service;

public abstract class UserService {

//    public abstract ICrudRepository<T> getRepository();
//
//    @Override
//    public T login(String login, String password) {
//        T userByLogin = getRepository().getUserByLogin(login);
//        if(userByLogin == null) {
//            System.out.println("User not found");
//            return null;
//        }
//
//        if(!userByLogin.getPassword().equals(password)){
//            System.out.println("Wrong password");
//            return null;
//        }
//        return userByLogin;
//    }
//
//    @Override
//    public boolean register(String login, String password) {
//       if(login.isEmpty() || password.isEmpty()) {
//           System.out.println("Login or password is empty");
//           return false;
//       }
//       getRepository().saveUser(login, password);
//        System.out.println("User registered successfully "+ login);
//       return true;
//    }
//
//    @Override
//    public T updateUserProfile(T userToUpdate) {
//
//        return getRepository().updateUser(userToUpdate);
//    }
//
//    private boolean isValidPassword(String password) {
//        if(password.length() < 6) {
//            return false;
//        }
//        return true;
//    }
}
