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
        }

        //add Participant
        public void addParticipant(User user) {
            if (!participants.contains(user)) {
                participants.add(user);
                System.out.println(user.getName() + " added to the conversation.");
            }
        }
        //removeParticipant
        public void removeParticipant(User user) {
            if (participants.contains(user)) {
                participants.remove(user);
                System.out.println(user.getName() + " removed from the conversation.");
            }
        }
        //Add the message to the conversation
        public void sendMessage(String messageId,User sender, String content) {
            if (participants.contains(sender)) {
                Message message = new Message(messageId,sender, content);
                messages.add(message);
            }
        }
        //delete message
        public void deleteMessage(String messageId) {
            for (Message message : messages) {
                if (message.getMessageId().equals(messageId)) {
                   messages.remove(message);
                   message.deleteMessage();
                }
            }
        }

      //display output
        public void displayConversation() {
          System.out.println("Participants: ");
            for (User participant : participants) {
                System.out.println("- " + participant.getName());
            }
            System.out.println("Messages: ");
            for (Message message : messages) {
               message.displayMessage();
            }
        }

}




