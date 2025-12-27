                    } else if (token.startsWith("id")) {
                        int id = Integer.parseInt(token.substring(2));
                        if (id >= 0 && id < numberOfUsers) mentions[id]++;
                    }
                }
            }
        }
        return mentions;
    }
}