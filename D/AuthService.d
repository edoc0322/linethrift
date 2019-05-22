/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
module AuthService;

import thrift.base;
import thrift.codegen.base;
import thrift.util.hashset;

import line_types;

interface AuthService {
  IdentityCredentialResponse updatePassword(string authSessionId, ref const(IdentityCredentialRequest) request);
  RSAKey getAuthRSAKey(string authSessionId, IdentityProvider identityProvider);
  string openAuthSession(ref const(AuthSessionRequest) request);
  string normalizePhoneNumber(string countryCode, string phoneNumber, string countryCodeHint);
  void respondE2EELoginRequest(string verifier, ref const(E2EEPublicKey) publicKey, string encryptedKeyChain, string hashKeyChain, ErrorCode errorCode);
  string confirmE2EELogin(string verifier, string deviceSecret);
  void logoutZ();
  LoginResult loginZ(ref const(LoginRequest) loginRequest);
  SecurityCenterResult issueTokenForAccountMigrationSettings(bool enforce);
  SecurityCenterResult issueTokenForAccountMigration(string migrationSessionId);
  string verifyQrcodeWithE2EE(string verifier, string pinCode, ErrorCode errorCode, ref const(E2EEPublicKey) publicKey, string encryptedKeyChain, string hashKeyChain);

  alias line_types.TalkException TalkException;

  enum methodMeta = [
    TMethodMeta(`updatePassword`, 
      [TParamMeta(`authSessionId`, 2), TParamMeta(`request`, 3)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getAuthRSAKey`, 
      [TParamMeta(`authSessionId`, 2), TParamMeta(`identityProvider`, 3)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`openAuthSession`, 
      [TParamMeta(`request`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`normalizePhoneNumber`, 
      [TParamMeta(`countryCode`, 2), TParamMeta(`phoneNumber`, 3), TParamMeta(`countryCodeHint`, 4)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`respondE2EELoginRequest`, 
      [TParamMeta(`verifier`, 1), TParamMeta(`publicKey`, 2), TParamMeta(`encryptedKeyChain`, 3), TParamMeta(`hashKeyChain`, 4), TParamMeta(`errorCode`, 5)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`confirmE2EELogin`, 
      [TParamMeta(`verifier`, 1), TParamMeta(`deviceSecret`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`logoutZ`, 
      [],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`loginZ`, 
      [TParamMeta(`loginRequest`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`issueTokenForAccountMigrationSettings`, 
      [TParamMeta(`enforce`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`issueTokenForAccountMigration`, 
      [TParamMeta(`migrationSessionId`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`verifyQrcodeWithE2EE`, 
      [TParamMeta(`verifier`, 2), TParamMeta(`pinCode`, 3), TParamMeta(`errorCode`, 4), TParamMeta(`publicKey`, 5), TParamMeta(`encryptedKeyChain`, 6), TParamMeta(`hashKeyChain`, 7)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    )
  ];
}
