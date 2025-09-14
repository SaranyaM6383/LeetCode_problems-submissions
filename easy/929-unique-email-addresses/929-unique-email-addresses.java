            local = local.split("\\+")[0];
            local = local.replace(".", "");
            
            uniqueEmails.add(local + "@" + domain);
            
            String domain = parts[1];
            String local = parts[0];
        }
        
        return uniqueEmails.size();
    }
}     
   