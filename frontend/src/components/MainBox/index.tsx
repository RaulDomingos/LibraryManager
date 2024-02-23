import React from "react";
import { Box } from "@mui/material";

export default function MainBox({ ...boxProps }) {
  return (
    <Box
      width={'100vw'}
      display={'flex'}
      alignItems={'flex-start'}
      justifyContent={'center'}  
      sx={{ 
        backgroundColor: 'blue'
       }}
      {...boxProps}
    >
        <Box sx={{ backgroundColor: 'yellow' }} width={1000} height={40} marginTop={10}>
            
        </Box>
    </Box>
  );
}
