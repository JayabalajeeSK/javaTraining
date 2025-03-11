package com.jb.T15ThreadsAndConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
    private int number;

    public Task(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Task " + number + " Started");
        for (int i = number * 100; i <= number * 100 + 99; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask " + number + " Done");
    }
}

public class ExecutorServiceRunner1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.shutdown();
    }
}
// Task 2 Started
// Task 1 Started
// 100 101 102 103 104 105 106 200 201 202 203 204 205 206 207 208 209 210 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122 123 211 212 124 213 214 125 215 126 127 128 129 130 216 131 217 132 218 133 134 135 136 219 137 220 221 138 222 139 140 141 142 143 223 144 145 146 147 224 148 225 226 227 228 229 149 150 151 152 153 230 154 231 155 156 157 158 232 233 234 159 235 236 237 238 239 240 241 242 243 244 245 246 247 160 161 162 163 164 165 166 248 249 250 251 252 253 254 167 168 255 169 256 170 171 172 173 174 175 176 257 177 178 179 180 181 182 183 184 185 186 187 188 189 190 191 258 259 260 261 262 263 264 265 266 192 267 268 269 270 271 272 273 193 274 275 276 277 194 278 279 280 281 282 283 284 195 285 196 197 286 198 199 287 288 289 290 291 292 293 294 295
// Task 1 Done
// 296 297 298 299
// Task 2 Done
// Task 3 Started
// 300 301 302 303 304 305 306 307 308 309 310 311 312 313 314 315 316 317 318 319 320 321 322 323 324 325 326 327 328 329 330 331 332 333 334 335 336 337 338 339 340 341 342 343 344 345 346 347 348 349 350 351 352 353 354 355 356 357 358 359 360 361 362 363 364 365 366 367 368 369 370 371 372 373 374 375 376 377 378 379 380 381 382 383 384 385 386 387 388 389 390 391 392 393 394 395 396 397 398 399
// Task 3 Done
