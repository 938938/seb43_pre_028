import React from 'react';
import { LinkIcon, LogoIcon } from './Icons';
import OAuthPart from './OAuthPart';
import LoginForm from './LoginForm';

function Login() {
  return (
    <div className="flex flex-col justify-center items-center h-screen w-full bg-gray-100">
      <LogoIcon />
      <OAuthPart where="Log in" />
      <LoginForm />
      <p className="font-light text-xs my-1 mt-4">
        Don’t have an account?
        <a
          href="http://#"
          className="font-thin text-xs text-sky-800 ml-1 hover:text-sky-600"
        >
          Sign up
        </a>
      </p>
      <p className="font-light text-xs my-1 flex">
        Are you an employer?
        <a
          href="http://#"
          className="flex items-end font-thin text-xs text-sky-800 ml-1 hover:text-sky-600 fill-sky-800 hover:fill-sky-600"
        >
          Sign up on Talent
          <LinkIcon />
        </a>
      </p>
    </div>
  );
}

export default Login;
