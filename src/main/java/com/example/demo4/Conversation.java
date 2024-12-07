package com.example.demo4;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.List;
public class Conversation {
        private String conversationId;
        private List<User> participants;
        private List<Message> messages;
        // private boolean isPrivate;//if two=1&more=0
        //private conversation
        public Conversation(String conversationId, User user1, User user2) {
            this.conversationId = conversationId;
            this.participants = new ArrayList<>();
            this.participants.add(user1);
            this.participants.add(user2);
            //this.isPrivate = true;
            this.messages = new ArrayList<>();
        }
        //public conversation
        public Conversation(String conversationId, List<User> participants) {
            this.conversationId = conversationId;
            this.participants = participants;
            // this.isPrivate = false;
            this.messages = new ArrayList<>();
//            ArrayList<String> list = new ArrayList<>();
        }

        //add Participant
        public void addParticipant(User user) {
            if (!participants.contains(user)) {
                participants.add(user);
                System.out.println(user.getName() + " added to the conversation.");
            } else {
                // System.out.println(user.getName() + " is already in the conversation.");
            }
        }
        //removeParticipant
        public void removeParticipant(User user) {
            if (participants.contains(user)) {
                participants.remove(user);//delet from arraylist
                System.out.println(user.getName() + " removed from the conversation.");
            } else {

            }
        }
        //Add the message to the conversation
//        public void sendMessage(User sender, String content) {
//            // Ensure sender is part of the conversation
//            if (participants.contains(sender)) {
//                // Create a new message
//                Message message = new Message(generateMessageId(), sender, content, new java.util.Date());
//                // Add the message to the conversation
//                messages.add(message);
//                System.out.println(sender.getName() + " sent a message: " + content);
//            } else {
//                System.out.println(sender.getName() + " is not part of this conversation.");
//            }
//        }
//        //display output
//        public void displayConversation() {
//            //System.out.println("Conversation ID: " + conversationId);
//            System.out.println("Participants: ");
//            for (User participant : participants) {
//                System.out.println("- " + participant.getName());
//            }
//            System.out.println("Messages: ");
//            for (Message message : messages) {
//                message.displayMessage();
//            }
//        }

}




