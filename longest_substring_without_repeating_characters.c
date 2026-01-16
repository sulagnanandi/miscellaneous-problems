int lengthOfLongestSubstring(char* str) {
    int ls_length = 0;
    int str_length = strlen(str);
    //int start = 0;
    //char ascii[126] = {0};

    for (int i = 0; i < str_length; i++)
    {
        //ascii[126] = {0};
        char ascii[256] = {0};

        // shift start of current sub +1 b/c atp, we found a duplicate character somewhere within the prev sub
        for (int j = i; j < str_length; j++)
        {
            if (ascii[str[j]] == 1) // letter already found within current substring
            {
                break; // break inner (j) for loop bc this current substring includes dupes
            }
            else
            {
                ascii[str[j]] = 1; // stating that the letter has been found within the current substring
                int current_sub_length = j - i + 1;
                if (current_sub_length > ls_length)
                    ls_length = current_sub_length;

                if (ls_length == str_length - i) // break bc we can't find any unique sub bigger than this
                    break;
            }
        }
    }

    return ls_length;
}