package com.jb.T15ThreadsAndConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1 extends Thread {
    public void run() {
        System.out.println("Task1 Started ");

        for (int i = 101; i <= 199; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask1 Done");
    }
}

class Task2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Task2 Started ");
        for (int i = 201; i <= 299; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask2 Done");
    }
}

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));
        System.out.print("\nTask3 Kicked Off\n");
        for (int i = 301; i <= 399; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask3 Done");
        System.out.println("\nMain Done");
        executorService.shutdown();

    }

}
// Task1 Started 

// Task3 Kicked Off
// 101 102 103 301 302 104 303 304 305 306 307 308 309 310 105 106 107 108 109 110 111 311 112 312 113 313 314 315 114 316 115 116 117 317 318 319 320 321 322 118 119 323 120 324 121 325 326 122 327 328 123 124 329 125 330 126 127 128 129 130 331 332 131 333 334 335 336 337 132 338 339 340 133 134 135 341 342 136 137 138 343 344 345 346 347 348 139 349 350 351 352 140 141 353 354 355 356 142 143 144 145 146 147 148 149 150 357 151 152 153 154 155 156 358 359 157 360 361 362 158 363 364 365 366 367 368 159 160 161 162 369 370 371 372 373 374 375 376 377 378 379 380 381 382 383 384 385 386 387 388 163 164 165 166 167 168 169 170 389 390 391 171 172 173 392 393 174 175 176 177 178 179 180 394 395 181 182 183 184 396 185 186 187 188 189 190 397 398 399 191        
// Task3 Done

// Main Done
// 192 193 194 195 196 197 198 199
// Task1 Done
// Task2 Started
// 201 202 203 204 205 206 207 208 209 210 211 212 213 214 215 216 217 218 219 220 221 222 223 224 225 226 227 228 229 230 231 232 233 234 235 236 237 238 239 240 241 242 243 244 245 246 247 248 249 250 251 252 253 254 255 256 257 258 259 260 261 262 263 264 265 266 267 268 269 270 271 272 273 274 275 276 277 278 279 280 281 282 283 284 285 286 287 288 289 290 291 292 293 294 295 296 297 298 299
// Task2 Done
