/**
     * User login
     *
     * @param userName
     * @return
     */
    @PostMapping("/userLogin")
    public String userLogin(@Param("userName") String userName,
                            @Param("password") String password, HttpServletRequest request) {
        User user = userService.userLogin(userName, password);
        if (null != user) {
            // flag = 0 indicates successful verification of user name and password [used for front-end verification]
            request.getSession().setAttribute("flag", 0);

            request.getSession().setAttribute("user", user);
            return "user/index";
        }

        // A flag of 1 indicates login failure [for front-end verification]
        request.getSession().setAttribute("flag", 1);
        return "index";
    }